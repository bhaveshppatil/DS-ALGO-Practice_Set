package Recursion;

import java.util.Scanner;

public class Factorial_Recursion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int factorial = calcFactorial(n);
        System.out.println(factorial);
    }

    private static int calcFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return (n * calcFactorial(n - 1));
    }
}
