package MACTimedContest2;

import java.util.Scanner;

public class Sjewness {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test != 0) {
            int n = scan.nextInt();
            int evenCount = 0;
            int oddCount = 0;

            for (int i = 1; i <= n; i++)
                if (n % i == 0) {
                    if (i % 2 == 0) {
                        evenCount++;
                    } else {
                        oddCount++;
                    }
                }
            if (evenCount > oddCount) {
                System.out.println("Even Skewed");
            } else if (evenCount == oddCount) {
                System.out.println("Not Skewed");
            } else {
                System.out.println("Odd Skewed");
            }
            test--;
        }
    }
}
