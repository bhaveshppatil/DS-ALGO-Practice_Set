package practice.Subarray_Questions;

import java.util.Scanner;

public class FindSubArrayWithZeroSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        /*
        input
        5
        -3 2 3 1 6
        */

        boolean isSumFound = false;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];

                if (sum == 0) {
                    isSumFound = true;
                    break;
                }
            }
        }
        if (isSumFound) {
            System.out.println("Sum Exits in array");
        } else {
            System.out.println("No Such Sub Array Exists!");
        }
    }
}
