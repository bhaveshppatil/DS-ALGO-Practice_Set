import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test != 0) {
            int n = scan.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scan.nextInt();
            }

            int[] sArr = new int[arr.length];
            int min = -1;
            Arrays.fill(sArr, min);
            Stack<Integer> stack = new Stack<>();
            for (int i = 0; i < n; i++) {
                while (!stack.isEmpty() && arr[stack.peek()] < arr[i] ){
                    sArr[stack.pop()] = arr[i];
                }
                stack.push(i);
            }

            for (int i = 0; i < sArr.length; i++) {
                System.out.print(sArr[i] + " ");
            }

            test--;
        }
    }
}


/*
for (int i = 0; i < n; i++) {
                int min = -1;
                for (int j = i + 1; j < n; j++) {
                    if (arr[j] > arr[i]) {
                        min = arr[j];
                        break;
                    }
                }
                System.out.print(min + " ");
            }

 */