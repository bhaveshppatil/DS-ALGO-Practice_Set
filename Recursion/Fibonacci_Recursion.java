package Recursion;

import java.util.Scanner;

public class Fibonacci_Recursion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int fibNum = fibonacciNum(n);
        System.out.println(fibNum);
    }

    private static int fibonacciNum(int n) {
        if (n <= 1) {
            return n;
        }
        return (fibonacciNum(n - 1) + fibonacciNum(n - 2));
    }
}
