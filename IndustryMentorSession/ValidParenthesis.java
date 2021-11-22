package IndustryMentorSession;

import java.util.Scanner;
import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        boolean isBalanced = checkBalancedParenthesis(str);

        if (isBalanced) {
            System.out.println("balanced");
        } else {
            System.out.println("unbalanced");
        }
    }

    private static boolean checkBalancedParenthesis(String str) {

        Stack<Character> stack = new Stack<>();
        char start = 's';
        char end = 'q';

        for (int i = 0; i < str.length(); i++) {
            start = str.charAt(i);

            if (start == '(' || start == '[' || start == '{') {
                stack.push(start);
            } else if (stack.isEmpty() && (start == ')' || start == ']' || start == '}')) {
                return false;
            } else if (!stack.isEmpty() && (start == ')' || start == ']' || start == '}')) {
                end = stack.peek();
                if (end == '(' && start != ')' || end == '[' && start != ']' || end == '{' && start != '}') {
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}