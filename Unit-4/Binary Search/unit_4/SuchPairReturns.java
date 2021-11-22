package unit_4;

import java.util.Scanner;

public class SuchPairReturns {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test != 0) {
            int n = scan.nextInt();
            int k = scan.nextInt();

            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = scan.nextInt();
            }
            int count = suchPairSum(arr, 0, n - 1, k);

            if (count == 1) {
                System.out.println("1");
            } else {
                System.out.println("-1");
            }

            test--;
        }
    }

    private static int suchPairSum(int[] arr, int low, int high, int k) {

        while (low < high) {
            int sum = arr[low] + arr[high];
            if (sum == k) {
                break;
            } else if (sum > k) {
                high--;
            } else {
                low++;
            }
        }
        return 0;
    }
}
