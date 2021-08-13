import java.util.Scanner;

public class TraversalQueries {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        for (int t = 0; t < test; t++) {
            int n = scan.nextInt();
            int m = scan.nextInt();
            int q = scan.nextInt();

            int[][] matrix = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    matrix[i][j] = scan.nextInt();
                }
            }
            if (q == 1) {
                for (int i = 0; i < n; i++) {

                    if (i % 2 == 0) {
                        for (int j = 0; j < m; j++) {
                            System.out.print(matrix[i][j] + " ");
                        }
                    }
                    if (i % 2 == 1) {
                        for (int j = m - 1; j >= 0; j--) {
                            System.out.print(matrix[i][j] + " ");
                        }
                    }
                }
            }

            if (q == 2) {

                for (int i = 0; i < n; i++) {

                    if (i % 2 == 0) {
                        for (int j = m - 1; j >= 0; j--) {
                            System.out.print(matrix[i][j] + " ");
                        }
                    }
                    if (i % 2 == 1) {
                        for (int j = 0; j < m; j++) {
                            System.out.print(matrix[i][j] + " ");
                        }
                    }
                }
            }

            System.out.println();
        }
    }
}
