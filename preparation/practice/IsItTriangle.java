package practice;

import java.util.Scanner;

//https://oj.masaischool.com/contest/2709/problem/03

public class IsItTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test != 0) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();

            if ((a + b) > c && (a + c) > b && (c + b) > a) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
            test--;
        }
    }
}
