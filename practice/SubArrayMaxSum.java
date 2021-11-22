package practice;

import java.util.Scanner;

public class SubArrayMaxSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        int max = 0;
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        max = Math.max(sum, max);

        for (int i = k; i < arr.length; i++) {
            sum -= arr[i - k];
            sum += arr[i];
            max = Math.max(sum, max);
        }
        System.out.println(max);
    }
}
