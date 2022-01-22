package practice.Subarray_Questions;

import java.util.Scanner;

public class LargestSubArrayWithZeroSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        int largest_length = findLargestSubArray(arr, n, k);
        System.out.println(largest_length);
    }

    /*
    8
    15 -2 2 -8 1 7 10 23
    */

    private static int findLargestSubArray(int[] arr, int n, int k) {
        int max_len = 0;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];

                if (sum == k){
                    max_len = Math.max(max_len, j - i +1);
                }
            }
        }
        return max_len;
    }
}
