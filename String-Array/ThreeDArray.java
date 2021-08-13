import java.util.Scanner;

public class ThreeDArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int m = scan.nextInt();
        int k = scan.nextInt();

        int[][][] arr = new int[n][m][k];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                for (int l = 0; l < k; l++) {
                    arr[i][j][l] = scan.nextInt();
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                for (int l = 0; l < k; l++) {
                    System.out.print(arr[i][j][l] + " ");
                }
                System.out.println();
            }
        }
    }
}
