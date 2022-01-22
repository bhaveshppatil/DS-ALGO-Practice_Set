package MACTimedContest2;

import java.util.Scanner;

public class NextGreaterElement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test != 0) {
            int n = scan.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                int nextGreater = -1;
                for (int j = i+1; j < n; j++) {
                    if (arr[i] < arr[j] ) {
                        nextGreater = arr[j];
                        break;
                    }
                }
                System.out.print(nextGreater + " ");
            }
            System.out.println();
            test--;
        }
    }
}
