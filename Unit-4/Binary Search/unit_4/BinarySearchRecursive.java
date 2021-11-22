package unit_4;

import java.util.Scanner;

public class BinarySearchRecursive {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        int output = binarySearch(arr, 0, n - 1, k);
        if (output != -1){
            System.out.println(1);
        }else {
            System.out.println(-1);
        }
    }

    private static int binarySearch(int[] arr, int low, int high, int k) {

        if (high >= low) {
            int midPoint = low + (high - low) / 2;

            if (arr[midPoint] == k) {
                return midPoint;

            } else if (arr[midPoint] < k) {
                return binarySearch(arr, midPoint + 1, high, k);

            } else
                return binarySearch(arr, low, midPoint - 1, k);
        }
        return -1;
    }
}
