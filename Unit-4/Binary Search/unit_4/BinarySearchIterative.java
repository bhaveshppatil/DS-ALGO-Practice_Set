package unit_4;

import java.util.Scanner;

public class BinarySearchIterative {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        int output = binarySearch(arr, 0, n - 1, k);
        if (output != -1) {
            System.out.println(1);
        } else {
            System.out.println(-1);
        }
    }

    private static int binarySearch(int[] arr, int low, int high, int k) {
        while (low <= high) {

            int midPoint = low + (high - low) / 2;

            if (arr[midPoint] == k) {
                return midPoint;

            } else if (arr[midPoint] < k) {
                low = midPoint + 1;

            } else {
                high = midPoint - 1;
            }
        }
        return -1;
    }
}
