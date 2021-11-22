package greedy_algorithm;

import java.util.Scanner;

public class SwappingSorting {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();

        while (test != 0) {
            int n = scan.nextInt();
            int swaps = scan.nextInt();

            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scan.nextInt();
            }
            miniArray(arr, n, swaps);

            test--;
        }
    }

    private static void miniArray(int[] arr, int n, int swaps) {
        for (int i = 0; i < n - 1; i++) {
            int pos = i;
            for (int j = i + 1; j < n; j++) {
                if (j - i > swaps) {
                    break;
                }
                if (arr[j] < arr[pos]) {
                    pos = j;
                    for (j = i; j < pos; j++) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                        swaps = swaps - (pos - i);
                    }
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
