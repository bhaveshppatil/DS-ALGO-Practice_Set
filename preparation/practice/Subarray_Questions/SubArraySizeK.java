package practice.Subarray_Questions;

import java.util.Scanner;

public class SubArraySizeK {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

       /*
       input
       8 4
       5 2 6 4 8 5 2 9
       */

        int sum = 0;
        for (int i = 0; i < n - k + 1; i++) {
            int max_sum = 0;
            for (int j = i; j < i + k; j++) {
                max_sum += arr[j];

                if (max_sum > sum) {
                    sum = max_sum;
                }
            }
        }
        System.out.println(sum);
    }
}

class SizeKSlidingWindow {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        int max_sum = findMaxSum(arr, n, k);
        System.out.println(max_sum);
    }

    private static int findMaxSum(int[] arr, int n, int k) {
        if (k > n) {
            return 0;
        }
        int max_sum = 0;
        for (int i = 0; i < k; i++) {
            max_sum += arr[i];
        }
        int window_sum = max_sum;
        for (int i = k; i < n; i++) {
            window_sum = window_sum - arr[i-k] + arr[i];
            max_sum = Math.max(max_sum, window_sum);
        }
        return max_sum;
    }
}
