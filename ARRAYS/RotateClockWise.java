import java.util.Scanner;

public class RotateClockWise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scan.nextInt();

            int[][] matrix = new int[n][n];
            for (int k = 0; k < n; k++) {
                for (int j = 0; j < n; j++) {
                    matrix[k][j] = scan.nextInt();
                }
            }
            System.out.println();

            for (int r = 0; r < matrix.length; r++) {
                for (int c = matrix.length - 1; c >= 0; c--) {
                    System.out.print(matrix[c][r] + " ");
                }
                System.out.println();
            }
        }
    }
}






/*
    for (int x = 0; x < n; i++) {
                int srt = 0;
                int end = n - 1;

                while (srt < end) {
                    int store = temp[x][srt];
                    temp[x][srt] = temp[x][end];
                    temp[x][end] = store;
                    srt++;
                    end--;
                }
            }
            for (int k = 0; k < n; k++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(matrix[k][j] + " ");
                }
                System.out.println();
            }
        }
 */