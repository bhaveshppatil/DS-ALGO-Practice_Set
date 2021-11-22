package Themed_Contest_3;

import java.util.Scanner;

public class CheckDuplicate {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test != 0) {
            int n = scan.nextInt();

            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scan.nextInt();
            }
            int count = 0;
            for (int i = 0; i < n; i++) {
                if (n == 1) {
                    count = 0;
                } else for (int j = i + 1; j < n; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                    }
                }
            }

            if (count >= 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

            count = 0;
            test--;
        }
    }
}
