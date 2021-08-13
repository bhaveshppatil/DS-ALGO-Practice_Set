import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int m = scan.nextInt();
        int total = scan.nextInt();

        int[][] matrix = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = scan.nextInt();
            }
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (m - j >= 3) {
                    if (matrix[i][j] + matrix[i][j + 1] + matrix[i][j + 2] == total) {
                        count++;
                    }
                }
                if (n - i >= 3) {
                    if (matrix[i][j] + matrix[i + 1][j] + matrix[i + 2][j] == total) {
                        count++;
                    }
                }
                if (m - j >= 3 && n - i >= 3) {
                    if (matrix[i][j] + matrix[i + 1][j + 1] + matrix[i + 2][j + 2] == total) {
                        count++;
                    }
                }
                if (m - j >= 3 && i >= 2) {
                    if (matrix[i][j] + matrix[i - 1][j + 1] + matrix[i - 2][j + 2] == total) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}

/*
    int rowsSum = 0;
        int colSum = 0;
        int diaSum = 0;
        int diaSum2 = 0;

        int count = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                rowsSum += matrix[i][j];
                colSum += matrix[j][i];
                if (i == j) {
                    diaSum += matrix[i][j];
                }
                if (i + j == matrix.length - 1) {
                    diaSum2 += matrix[i][j];
                }
            }
            if (rowsSum == total) {
                count++;
                rowsSum = 0;
            }
            if (colSum == total) {
                count++;
                colSum = 0;
            }
            if (diaSum == total) {
                count++;
                diaSum = 0;
            }
            if (diaSum2 == total) {
                count++;
                diaSum2 = 0;
            }
        }
        System.out.println(count);
 */