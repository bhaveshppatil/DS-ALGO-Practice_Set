import java.util.Scanner;

public class CircularTraversal {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        for (int t = 0; t < test; t++) {
            int n = scan.nextInt();
            int[][] matrix = new int[n][n];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = scan.nextInt();
                }
            }

            for (int i = 0; i < n; i++) {
                System.out.print(matrix[(n - 1) - i][0] + " ");
            }
            for (int i = 0; i < n - 1; i++) {
                System.out.print(matrix[0][i + 1] + " ");
            }
            for (int i = 0; i < n - 1; i++) {
                System.out.print(matrix[i + 1][n - 1] + " ");
            }
            for (int i = n - 1; i > 1; i--) {
                System.out.print(matrix[n - 1][i - 1] + " ");
            }
            System.out.println();
        }
    }
}
