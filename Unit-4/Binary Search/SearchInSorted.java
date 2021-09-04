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

        int searchNum = findNumInSortArray(arr, 0, n - 1, k);

        System.out.println(searchNum);

    }

    private static int findNumInSortArray(int[] arr, int low, int high, int k) {

        //if element is not present in array then low is greater than high
        if (low > high) {
            return -1;
        }
        // find mid point in array
        int mid = low + (high - low) / 2;

        //if array mid element = k
        if (arr[mid] == k) {
            return mid;
        }

        if (arr[low] <= arr[mid]) {
            if (arr[low] <= k) {
                // if array lowest element is <= k then find search element in between
                return findNumInSortArray(arr, low, mid - 1, k);
            } else {
                //if greater then increase midpoint and find element in between mid and high
                return findNumInSortArray(arr, mid + 1, high, k);
            }
        } else {
            if (arr[mid] <= k) {
                return findNumInSortArray(arr, mid + 1, high, k);
            } else {
                return findNumInSortArray(arr, low, mid - 1, k);
            }
        }
    }
}
