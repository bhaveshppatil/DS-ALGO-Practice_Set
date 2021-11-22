package unit_4;

import java.util.Arrays;
import java.util.Scanner;

public class DiscoverNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int queries = scan.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        Arrays.sort(arr);

        int[] qArr = new int[queries];
        for (int i = 0; i < queries; i++) {
            qArr[i] = scan.nextInt();
        }

        for (int i = 0; i < qArr.length; i++) {
            int num = qIsPresentOrNot(arr, 0, n - 1, qArr[i]);
            if (num == qArr[i]){
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
        }
    }

    private static int qIsPresentOrNot(int[] arr, int low, int high, int k) {
        int result = -1;

        if (low <= high) {

            int mid = low + (high - low) / 2;

            if (arr[mid] == k) {
                result = arr[mid];
            } else if (arr[mid] > k) {
                return qIsPresentOrNot(arr, low, mid - 1, k);
            } else {
                return qIsPresentOrNot(arr, mid + 1, high, k);
            }
        }
        return result;
    }
}
/*
   boolean isPresent = false;
        for (int j = 0; j < queries; j++) {
            for (int i = 0; i < n; i++) {

                if (qArr[j] == arr[i]) {
                    isPresent = true;
                    break;
                } else {
                    isPresent = false;
                }
            }
            if (isPresent) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
 */