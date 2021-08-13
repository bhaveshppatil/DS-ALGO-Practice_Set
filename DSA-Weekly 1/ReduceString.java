import java.util.Scanner;
import java.util.Stack;

public class ReduceString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        char[] chArr = str.toCharArray();

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            if (!stack.isEmpty() && str.charAt(i) == stack.peek()) {
                stack.pop();
            } else {
                stack.push(str.charAt(i));
            }
        }
        if (!stack.isEmpty()) {
            for (Character ch :stack){
                System.out.print(ch);
            }
        } else {
            System.out.println("Empty String");

        }
    }
}
