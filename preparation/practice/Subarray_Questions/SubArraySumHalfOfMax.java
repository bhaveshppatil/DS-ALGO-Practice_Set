package practice.Subarray_Questions;

import java.util.Scanner;

public class SubArraySumHalfOfMax {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        int sum = 0, half_sum = 0;
        for (int i = 0; i < n - k + 1; i++) {
            int max = 0;
            for (int j = i; j < i + k; j++) {
                max += arr[j];

                if (max > sum) {
                    sum = max;
                }
            }
        }
    }
}
