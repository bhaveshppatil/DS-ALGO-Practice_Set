import java.util.Scanner;

public class SpiralTraversal2 {
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

            for (int i = n - 1; i >= 1; i--) {
                System.out.print(arr[i][0] + " ");
            }

            for (int i = 0; i < m - 1; i++) {
                System.out.print(arr[0][i] + " ");
            }

            for (int i = 0; i < n - 1; i++) {
                System.out.print(arr[i][m - 1] + " ");
            }
            int z = 0;

            for (int i = m - 1; i >= 1; i--) {
                System.out.print(arr[n - 1][i] + " ");
            }
            ++z;
            for (int i = 1; i < n - 1; i++) {
                System.out.print(arr[z][i] + " ");
            }


            System.out.println();
        }
    }
}

/*
  for (int i = 0; i < 2; i++) {
                if (i == 0) {
                    for (int k = n - 2; k > 0; k--) {
                        System.out.print(arr[k][1] + " ");
                    }
                } else {
                    if (n-1 == 2){
                        System.out.print(arr[1][n- 1]);
                    }
                }
            }
 */