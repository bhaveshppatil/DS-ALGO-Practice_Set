package practice;

import java.util.Scanner;

public class KazamaShinchan {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        int k = scan.nextInt();

        int numPosition = findNumPos(arr, k);
        System.out.println(numPosition);
    }

    private static int findNumPos(int[] arr, int k) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int midpos = (left + right) / 2;
            if (arr[midpos] == k) {
                return midpos;

            } else if (arr[midpos] < k) {
                left = midpos + 1;
            } else {
                right = midpos - 1;
            }
        }
        return right + 1;
    }
}
