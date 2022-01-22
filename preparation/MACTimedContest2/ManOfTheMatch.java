package MACTimedContest2;

import java.util.Scanner;

public class ManOfTheMatch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test != 0) {
            int n = scan.nextInt();
            int[] arr = new int[n * 6];

            for (int i = 0; i < n * 6; i++) {
                arr[i] = scan.nextInt();
            }
            int abScore = 0;
            int viratScore = 0;

            for (int i = 0; i < arr.length; i++) {
                if (i == 0) {
                    abScore += arr[i];
                }
                for (int j = 0; j < n; j++) {
                    if (arr[i] % 2 == 0){
                        abScore += arr[i];
                    }
                }
            }
            test--;
        }
    }
}
