package unit_4;

import java.util.Scanner;

public class numberOccurencesLogn {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        int result = totalNumInArray(arr, k);
        System.out.println(result);
    }

    private static int totalNumInArray(int[] arr, int k) {
        int lowerBound = lowerBound(arr, 0, arr.length - 1, k);
        int upperBound = upperBound(arr, 0, arr.length - 1, k);

        int output = upperBound - lowerBound + 1;
        if (lowerBound == -1) {
            return 0;
        }
        return output;
    }

    private static int lowerBound(int[] arr, int low, int high, int k) {
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == k) {
                ans = mid;
                high = mid - 1;
            } else if (arr[mid] > k) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    private static int upperBound(int[] arr, int low, int high, int k) {
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == k) {
                ans = mid;
                low = mid + 1;
            } else if (arr[mid] > k) {
                high = mid - 1;

            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
}
