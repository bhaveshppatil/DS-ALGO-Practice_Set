import java.util.Scanner;

public class CatchNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        for (int t = 0; t < test; t++) {
            int[][] arr = {
                    {1, 2, 9, 10, 25},
                    {4, 3, 8, 11, 24},
                    {5, 6, 7, 12, 23},
                    {16, 15, 14, 13, 22},
                    {17, 18, 19, 20, 21}
            };

            int n = scan.nextInt();
            int m = scan.nextInt();
            int count =0;
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    count = arr[n-1][m-1];
                }
            }
            System.out.println(count);
        }
    }
}
