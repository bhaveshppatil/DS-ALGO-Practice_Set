package practice.Subarray_Questions;

import java.util.Scanner;

public class SubArrayWithSumZero {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        /*
        input
        11
        6 3 -1 -3 4 -2 2 4 6 -12 -7
        */
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];

                if (sum == 0) {
                    System.out.println("index " + i + "," + j);
                }
            }
        }
    }
}
