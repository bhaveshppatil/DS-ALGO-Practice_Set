package MACTimedContest2;

import java.util.Scanner;

public class CheckSkewness {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int test = scan.nextInt();
        while (test != 0) {
            int n = scan.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scan.nextInt();
            }
            int leftCount = 0;
            int rightCount = 0;
            int backCount = 0;

            for (int i = 0; i < n; i++) {
                if (i > 0 && arr[i] < arr[i - 1]) {
                    leftCount++;
                    System.out.print(arr[i - 1] + " ");
                }

                if (leftCount != 1) {
                    for (int j = i + 1; j < n; j++) {
                        if (arr[i] < arr[j]) {
                            rightCount++;
                            System.out.print(arr[j] + " ");
                            break;
                        }
                    }
                }
                if (leftCount != 1 && rightCount == 0) {
                    for (int j = i - 1; j >= 0; j--) {
                        if (arr[i] < arr[j]) {
                            backCount++;
                            System.out.print(arr[j] + " ");
                            break;
                        }
                    }
                }
                if (leftCount == 0 && rightCount == 0 && backCount == 0) {
                    System.out.print("-1" + " ");
                }
                leftCount = 0; rightCount = 0; backCount = 0;
            }
            System.out.println();
            test--;
        }
    }
}

