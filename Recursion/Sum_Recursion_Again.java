package Recursion;

import java.util.Scanner;

public class Sum_Recursion_Again {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();

        for (int t = 0; t < test; t++) {

            int n = scan.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = scan.nextInt();
            }

            int absDiff = absoluteDiff(arr, n);
            System.out.println(absDiff);
        }
    }

    private static int absoluteDiff(int[] arr, int n) {

        int sum;
        if (n == 0 || n == 1) {
            return 0;
        }
        sum = Math.abs(arr[n - 2] - arr[n - 1]);
        sum += absoluteDiff(arr, n - 1);
        return sum;
    }
}
