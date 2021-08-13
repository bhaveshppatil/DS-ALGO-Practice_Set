import java.util.Scanner;

public class NTraversal {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int test = scan.nextInt();
        for (int t = 0; t < test; t++) {
            int m = scan.nextInt();

            int[][] arr = new int[m][m];

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < m; j++) {
                    arr[i][j] = scan.nextInt();
                }
            }

            for (int i = m - 1; i >= 0; i--) {
                System.out.print(arr[i][0] + " ");
            }

            for (int i = 1; i < m; i++) {
                System.out.print(arr[i][i] + " ");
            }

            for (int i = m - 2; i >= 0; i--) {
                System.out.print(arr[i][m - 1] + " ");
            }
        }
    }
}
