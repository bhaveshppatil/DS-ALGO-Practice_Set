package practice;

import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        // 12 3 -2 5 21 7
        for (int i = 0; i < n - 1; i++) {
            int min_val = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_val]) {
                    min_val = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min_val];
            arr[min_val] = temp;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
