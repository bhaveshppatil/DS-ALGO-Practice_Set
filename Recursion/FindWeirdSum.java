package Recursion;

import java.util.Scanner;

public class FindWeirdSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test != 0) {
            int n = scan.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = scan.nextInt();
            }

            int largest = arr[0];
            for (int i = 0; i < n; i++) {
                if (arr[i] > largest) {
                    largest = arr[i];
                }
            }

            boolean isEqual = findSumEqualToLarge(arr, n, largest);
            if (isEqual) {
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
            test--;
        }
    }

    private static boolean findSumEqualToLarge(int[] arr, int n, int largest) {
        boolean isEqual = false;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == largest && arr[i] != 0 && arr[j] != 0) {
                    isEqual = true;
                    break;
                }
            }
        }
        return isEqual;
    }
}
