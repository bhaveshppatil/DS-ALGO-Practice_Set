package Coderbyte;

import java.util.Scanner;
import java.util.Stack;

public class StackGame {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test != 0) {
            int n = scan.nextInt();
            int m = scan.nextInt();
            String str = "";
            do {
                str = scan.next();
            }
            while (str.length() != n + m);

            traverseString(str);
            test--;
        }
    }

    private static void traverseString(String str) {

        Stack<Character> stack = new Stack<>();
        char start = 's';
        char end = 'q';

        for (int i = 0; i < str.length(); i++) {
            start = str.charAt(i);

            if (start == '(') {
                stack.push(start);
            } else if (start == ')') {
                stack.pop();
            }
        }

        if (stack.isEmpty()) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
