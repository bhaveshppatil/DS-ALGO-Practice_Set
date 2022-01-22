package practice;

import java.util.Scanner;

public class SpiralTraversalV {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test != 0) {
            int n = scan.nextInt();
            int[][] arr = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    arr[i][j] = scan.nextInt();
                }
            }
            spiralTraversal(n, arr);
            test--;
        }
    }

    private static void spiralTraversal(int n, int[][] arr) {
        for (int i = 0; i < n - 1; i++) {
            System.out.print(arr[i][n - 1] + " ");
        }
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(arr[n - 1][i] + " ");
        }
        for (int i = n - 2; i >= 0; i--) {
            System.out.print(arr[i][0] + " ");
        }
        for (int i = 1; i <= n - 2; i++) {
            System.out.print(arr[0][i] + " ");
        }
        for (int i = 1; i <= n - 2; i++) {
            System.out.print(arr[i][n - 2] + " ");
        }
        for (int i = n - 3; i >= 1; i--) {
            System.out.print(arr[n - 2][i] + " ");
        }
        for (int i = n - 3; i >= 1; i--) {
            System.out.print(arr[i][1] + " ");
        }
        for (int i = 1; i <= n - 3; i++) {
            System.out.print(arr[i][n-3] + " ");
        }
    }
}

/*
1
5
2 6 3 7 1
3 2 4 4 5
2 8 5 9 2
6 6 1 8 6
8 6 9 9 1

1 5 2 6 1 9 9 6 8 6 2 3 2 6 3 7 4 9 8 1 6 8 2 4 5
1 5 2 6 1 9 9 6 8 6 2 3 2 6 3 7 4 9 8 1 6 8 2 4 5

7
3 6 5 1 6 9 1
6 3 7 4 8 5 9
5 4 6 7 4 2 2
3 1 7 4 9 6 5
7 8 8 9 9 8 6
8 8 2 1 4 5 7
9 5 8 1 9 5 6

1 9 2 5 6 7 6 5 9 1 8 5 9 8 7 3 5 6 3 6 5 1 6 9 5 2 6 8 5 4 1 2 8 8 1 4 3 8 4 9 9
1 9 2 5 6 7 6 5 9 1 8 5 9 8 7 3 5 6 3 6 5 1 6 9 5 2 6 8 5 4 1 2 8 8 1 4 3 7 4 8 4 9 9 9 8 7 6 7 4



*/