import java.util.Scanner;
import java.util.Stack;

public class SmallerNeighbourEle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {

            while (!stack.isEmpty() && stack.peek() >= arr[i]){
                stack.pop();
            }
            if (stack.isEmpty()){
                System.out.print(-1 + " ");
            }else {
                System.out.print(stack.peek() + " ");
            }
            stack.push(arr[i]);
        }
        System.out.println();
    }
}
