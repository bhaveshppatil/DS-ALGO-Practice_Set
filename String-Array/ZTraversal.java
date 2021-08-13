import java.util.Scanner;

public class ZTraversal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        for (int t = 0; t < test; t++) {
            int n = scan.nextInt();
            int[][] arr = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    arr[i][j] = scan.nextInt();
                }
            }
            for (int i = 0; i < n - 1; i++) {
                System.out.print(arr[0][i] + " ");
            }
            int m = n;
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i][m - 1] + " ");
                m--;
            }

            for (int i = 1; i < n; i++) {
                System.out.print(arr[n - 1][i] + " ");
            }
        }
    }
}
