package DSA_Context_Random;

import java.util.Scanner;

public class MajorityElement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test != 0) {
            int n = scan.nextInt();

            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scan.nextInt();
            }
            int max = 0;
            int index = -1;

            for (int i = 0; i < n; i++) {
                int count = 0;
                for (int j = 0; j < n; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                    }
                }
                if (count > max) {
                    max = count;
                    index = i;
                }
            }

            if (max > n / 2) {
                System.out.println(arr[index]);
            }else {
                System.out.println(index);
            }
            test--;
        }
    }
}
