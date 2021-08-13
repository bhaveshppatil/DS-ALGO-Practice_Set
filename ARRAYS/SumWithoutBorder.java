import java.util.Scanner;

public class SumWithoutBorder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int t1 = 0; t1 < t; t1++) {
            int n = scan.nextInt();
            int m = scan.nextInt();

            int[][] matrix = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    matrix[i][j] = scan.nextInt();
                }
            }
            int sum = 0;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (i == 0 || j == 0 || i == n - 1 || j == n - 1) {

                    } else  {
                        sum += matrix[i][j];
                    }
                }
            }
            System.out.println(sum);
        }
    }
}
