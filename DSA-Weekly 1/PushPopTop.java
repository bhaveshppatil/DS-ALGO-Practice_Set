import java.util.Scanner;
import java.util.Stack;

public class PushPopTop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        for (int t = 0; t < test; t++) {
            int n = scan.nextInt();

            Stack<Integer> stack = new Stack<>();

            if (n == 1) {
                int number = scan.nextInt();
                stack.push(number);
            } else if (n == 2) {
                if (!stack.isEmpty()){
                    System.out.println(stack.pop());
                }else {


                }
            }else {

            }

        }
    }
}
/*
   if (n == 3) {
                System.out.println(stack.pop());
                if (stack.isEmpty()) {
                    System.out.println("Empty!");
                }
            }
 */