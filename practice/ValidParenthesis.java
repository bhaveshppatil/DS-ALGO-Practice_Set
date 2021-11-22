package practice;

import java.util.Scanner;
import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        boolean isValid = validParenthesis(str);
        System.out.println(isValid);
    }

    private static boolean validParenthesis(String str) {
        char start = 'b';
        char end = 'n';
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            start = str.charAt(i);

            if (start == '(' || start == '{' || start == '[') {
                stack.push(start);
            } else if (stack.isEmpty() && (start == ')' || start == '}' || start == ']')) {
                return false;
            } else if (!stack.isEmpty() && (start == ')' || start == '}' || start == ']')) {
                end = stack.peek();
                if (end == '(' && start != ')' || end == '[' && start != ']' || end == '{' && start != '}') {
                    return false;
                }
                stack.pop();
            }
        }
        if (!stack.isEmpty()){
            return false;
        }
        return true;
    }
}
