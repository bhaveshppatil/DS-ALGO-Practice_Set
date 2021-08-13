import java.util.Scanner;

public class ReverseNTraverse {
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
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i][0] + " ");
            }
            int m = 1;
            for (int i = n - 2; i >= 0; i--) {
                System.out.print(arr[i][m] + " ");
                m++;
            }
            for (int i = 1; i < n; i++) {
                System.out.print(arr[i][n-1] + " ");
            }
        }
    }
}
