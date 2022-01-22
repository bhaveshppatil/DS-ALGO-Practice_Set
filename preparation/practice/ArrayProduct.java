package practice;


//https://oj.masaischool.com/contest/2678/problem/05

import java.util.Scanner;

public class ArrayProduct {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int product = scan.nextInt();

        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scan.nextInt();
            }
        }
        int total = twoArrayAndProduct(n, m, arr, product);
        System.out.println(total);
    }

    private static int twoArrayAndProduct(int n, int m, int[][] matrix, int product) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i < n - 2) {
                    if (matrix[i][j] + matrix[i + 1][j] + matrix[i + 2][j] == product) {
                        count++;
                    }
                }
                if (j < m - 2) {
                    if (matrix[i][j] + matrix[i][j + 1] + matrix[i][j + 2] == product) {
                        count++;
                    }
                }
                if (i < n - 2 && j < m - 2) {
                    if (matrix[i][j] + matrix[i + 1][j + 1] + matrix[i + 2][j + 2] == product) {
                        count++;
                    }
                }
            }
            break;
        }
        return count;
    }
}
