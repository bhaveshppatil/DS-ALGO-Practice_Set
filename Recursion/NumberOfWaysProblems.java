package Recursion;

import java.util.Scanner;

public class NumberOfWaysProblems {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int noOfWays = findNumOfWays(n);
        System.out.println(noOfWays);
    }

    private static int findNumOfWays(int n) {

        if (n < 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }
        return findNumOfWays(n-1) + findNumOfWays(n-2) + findNumOfWays(n-3);
    }
}
