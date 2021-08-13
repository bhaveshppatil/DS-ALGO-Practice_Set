import java.util.Scanner;

public class ArrayPhrase {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int m = scan.nextInt();


        char[][] arr = new char[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i] = scan.next().toCharArray();
                System.out.println(arr[i][j]);
            }
        }


        /*
   j     0 1 2 3 4
   i   0 s a f e r
       1 a m j a d
       2 b a b o l
       3 a a r o n
       4 s o n g s
       */


        String word = "saba";
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {

                if (j < m - 3) {
                    String horizontal = "";
                    horizontal += arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i][j + 3];
                    if (horizontal.equals(word)) {
                        count++;
                    }
                }
                if (i < n - 3) {
                    String vertical = "";
                    vertical += arr[i][j] + arr[i + 1][j] + arr[i + 2][j] + arr[i + 3][j];

                    if (vertical.equals(word)) {
                        count++;
                    }
                }
                if (i < n - 3 && i < m - 3) {
                    String diaDown = "";
                    diaDown += arr[i][j] + arr[i + 1][j + 1] + arr[i + 2][j + 2] + arr[i + 3][j + 3];
                    if (diaDown.equals(word)) {
                        count++;
                    }
                }
                if (i >= 3 && j < m - 3) {
                    String diaUp = "";
                    diaUp += arr[i][j] + arr[i - 1][j + 1] + arr[i - 2][j + 2] + arr[i - 3][j + 3];
                    if (diaUp == word) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
