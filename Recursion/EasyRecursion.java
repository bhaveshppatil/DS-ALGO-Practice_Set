package Recursion;

import java.util.Scanner;

public class EasyRecursion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test != 0) {
            int n = scan.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scan.nextInt();
            }
            int totalSum = findSumOfArray(arr, n);
            System.out.println(totalSum);
            test--;
        }
    }

    private static int findSumOfArray(int[] arr, int n) {
        if (n <= 0) {
            return 0;
        }
        return (findSumOfArray(arr, n - 1) + arr[n-1]);
    }
}
