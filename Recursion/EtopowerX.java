package Recursion;

import java.util.Scanner;

public class EtopowerX {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int n = scan.nextInt();

        double power = findPower(x, n);
        System.out.printf("%.4f%n", power);

    }

    private static double findPower(double x, double n) {
        if (n == 0) {
            return 1;
        }
        double num = power(x, n);
        double ans = num / factorial(n) + findPower(x, n - 1);
        return ans;
    }

    private static double factorial(double n) {
        if (n ==0){
            return 1;
        }
        return n * factorial(n - 1);
    }

    private static double power(double x, double n) {
        return Math.pow(x, n);
    }
}
