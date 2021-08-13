import java.util.Scanner;

public class TraverseArray2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int m = scan.nextInt();

        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scan.nextInt();
            }
        }

        for (int i = m-1; i >= 0; i--) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[j][i] + " ");
            }
        }
    }
}
