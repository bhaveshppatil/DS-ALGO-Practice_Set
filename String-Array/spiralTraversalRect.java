
import java.util.ArrayList;
import java.util.Scanner;

public class spiralTraversalRect {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int test = scan.nextInt();
        for (int t = 0; t < test; t++) {
            int n = scan.nextInt();
            int m = scan.nextInt();

            int[][] arr = new int[n][m];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    arr[i][j] = scan.nextInt();
                }
            }

            int top = 0;
            int bottom = n - 1;
            int left = 0;
            int right = m - 1;

            for (int i = 0; i < n; i++) {
                System.out.print(arr[i][0] + " ");
            }
            for (int i = 1; i < m; i++) {
                System.out.print(arr[n - 1][i] + " ");
            }
            for (int i = n - 2; i >= 0; i--) {
                System.out.print(arr[i][m - 1] + " ");

            }
            right--;
            top++;
            for (int i = right; i > left; i--) {
                System.out.print(arr[top][i] + " ");
                if (i == 1) {
                    for (int j = 1; j < m - 1; j++) {
                        System.out.print(arr[top][j] + " ");
                    }
                    top++;
                }
            }
            System.out.println();
        }
    }
}
