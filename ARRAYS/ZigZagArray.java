import java.util.Scanner;

public class ZigZagArray {
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

        for (int i = 0; i < n; i++) {
            if (i % 2 != 0)
                for (int j = 0; j < m; j++)
            System.out.print(arr[i][j] + " ");
            else
                for (int k = m-1; k >= 0; k--)
            System.out.print(arr[i][k] + " ");
        }
    }
}
