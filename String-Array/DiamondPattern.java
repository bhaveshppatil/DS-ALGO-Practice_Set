import java.util.Scanner;

public class DiamondPattern {
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

            int k = matrix.length;
            int l = matrix.length - 1;

            for (int i = n / 2; i >= 0; i--) {
                System.out.print(matrix[i][l--] + " ");
            }
            for (int i = 1; i <= n / 2; i++) {
                System.out.print(matrix[i][l--] + " ");
            }
            l = 1;
            for (int i = n / 2 + 1; i <= n - 1; i++) {
                System.out.print(matrix[i][l++]);
            }
            for (int i = n - 2; i > n / 2; i--) {
                System.out.print(matrix[i][l++] + " ");
            }
        }
    }
}
