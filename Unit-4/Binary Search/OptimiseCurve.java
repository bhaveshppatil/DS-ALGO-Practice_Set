import java.util.Scanner;

public class OptimiseCurve {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test != 0) {

            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();
            int k = scan.nextInt();

            int ans = lowerBound(a, b, c, k);
            System.out.println(ans);
            test--;
        }
    }

    private static int lowerBound(int a, int b, int c, int k) {
        if (k < c) {
            return -1;
        }
        int low = 0, high = k, res = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int sum = a * mid * mid + b * mid + c;
            if (sum > k) {
                res = mid;
                high = mid - 1;
            } else if (sum < k) {
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return res;
    }
}
