package greedy_algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArraySumMaximization {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test != 0) {
            int n = scan.nextInt();

            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scan.nextInt();
            }
            int totalSum = 0;
            int k = 0;
            ArrayList<Integer> arrayList = new ArrayList<>();
            for (int i = 0; i < n; i++, k++) {
                for (int j = i; j < n; j++) {
                    if (i == j) {
                        totalSum += arr[i];
                    } else if (arr[i] < i || arr[i] == 1) {
                        totalSum += arr[i] * -1;
                    } else {
                        totalSum += arr[i] - i;
                    }
                    arrayList.add(totalSum);
                    totalSum = 0;
                }
            }

            int maxSum = Collections.max(arrayList);
            System.out.println(maxSum);
            test--;
        }
    }
}
