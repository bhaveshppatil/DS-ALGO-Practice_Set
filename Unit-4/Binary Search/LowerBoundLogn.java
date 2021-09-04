import java.util.Arrays;
import java.util.Scanner;

public class LowerBoundLogn {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        Arrays.sort(arr);
        int output = lowerBound(arr, 0, n - 1, k);
        if (output != -1) {
            System.out.println(output);
        } else {
            System.out.println(-1);
        }
    }

    private static int lowerBound(int[] arr, int low, int high, int k) {
        int result = -1;

        while (low <= high) {
            int midPoint = low + (high - low) / 2;

            if (arr[midPoint] == k) {
                result = midPoint;
                high = midPoint - 1;
            } else if (arr[midPoint] > k) {
                high = midPoint - 1;
            } else {
                low = midPoint + 1;
            }
        }
        return result;
    }
}

/*
10 5
0 2 4 4 5 5 7 7 9 10
 */
