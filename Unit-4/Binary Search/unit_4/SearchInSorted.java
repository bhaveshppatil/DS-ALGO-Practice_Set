package unit_4;

import java.util.Scanner;

public class SearchInSorted {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        int numInArray = findNumInArray(arr, 0, n - 1, k);

        System.out.println(numInArray);

    }

    private static int findNumInArray(int[] arr, int low, int high, int k) {

        if (low > high) {
            return -1;
        }
        int mid = low + (high - low) / 2;

        if (arr[mid] == k) {
            return mid;
        }

        if (arr[low] <= arr[mid]) {
            if (arr[low] <= k && arr[mid] >= k) {
                return findNumInArray(arr, low, mid - 1, k);
            } else {
                return findNumInArray(arr, mid + 1, high, k);
            }
        } else {
            if (arr[mid] <= k && arr[high] >= k) {
                return findNumInArray(arr, mid + 1, high, k);
            } else {
                return findNumInArray(arr, low, mid - 1, k);
            }
        }
    }
}
