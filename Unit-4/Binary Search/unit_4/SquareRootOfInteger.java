package unit_4;

import java.util.Scanner;

public class SquareRootOfInteger {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test != 0) {
            int n = scan.nextInt();

            long squareRoot = findSquareRoot(0, n, n);
            System.out.println(squareRoot);
            test--;
        }
    }

    private static long findSquareRoot(int low, int high, int n) {

        int res = -1;

        if (low <= high) {
            int mid = low + (high - low) / 2;
            int nextM = mid + 1;

            if (mid * mid <= n) {
                res = mid;
                return mid;
            } else if (mid * mid < n) {
                high = mid + 1;
            } else {
                low = mid - 1;
            }
        }
        return res;
    }
}
