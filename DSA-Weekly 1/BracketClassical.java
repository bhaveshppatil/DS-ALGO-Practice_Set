import java.util.Scanner;
import java.util.Stack;

public class BracketClassical {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        int test = scan.nextInt();
//        while (test != 0){
        String str = scan.nextLine();

        Stack<Character> stack = new Stack<>();
        boolean isBalanced = true;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }

            if (stack.isEmpty()) {
                isBalanced = false;
                break;
            }
            if (ch == ')') {
                if (stack.peek() == '(') {
                    stack.pop();
                } else {
                    isBalanced = false;
                }
            }
            if (ch == ']') {
                if (stack.peek() == '[') {
                    stack.pop();
                } else {
                    isBalanced = false;
                }
            }
            if (ch == '}') {
                if (stack.peek() == '{') {
                    stack.pop();
                } else {
                    isBalanced = false;
                }
            }
        }
        if (!stack.isEmpty()) {
            isBalanced = false;
        }
        if (isBalanced) {
            System.out.println("balanced");
        } else {
            System.out.println("not balanced");
        }
    }
}



