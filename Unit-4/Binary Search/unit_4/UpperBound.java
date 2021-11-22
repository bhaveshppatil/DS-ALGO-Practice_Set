package unit_4;

import java.util.Arrays;
import java.util.Scanner;

public class UpperBound {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int k = scan.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        Arrays.sort(arr);
        int output = upperBound(arr, 0, n - 1, k);
        if (output <= k) {
            System.out.println(output);
        } else {
            System.out.println(-1);
        }
    }

    private static int upperBound(int[] arr, int low, int high, int k) {
        int ans = -1;

        while (low <= high) {
             int mid = low + (high - low) / 2;
            if (arr[mid] <= k) {
                low = mid + 1;

            } else {
                ans = mid;
                high = mid - 1;
            }
        }
        return ans;
    }
}
