import java.util.Scanner;

public class NQueensVariant {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = 0;
            }
        }
        int count = chessQueen(arr, 0);
        System.out.println(count);
    }

    private static int chessQueen(int[][] arr, int rows) {
        int count = 0;
        if (rows >= arr.length) {
            ++count;
            possibleSolution(arr);
        } else {
            for (int col = 0; col < arr.length; col++) {
                if (isQueenPlaceSafe(arr, rows, col)) {
                    arr[rows][col] = 1;
                    chessQueen(arr, rows + 1);
                    arr[rows][col] = 0;
                }
            }
        }
        return count;
    }

    private static void possibleSolution(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }


    private static boolean isQueenPlaceSafe(int[][] arr, int rows, int col) {

        // check vertical places
        for (int i = rows - 1; i >= 0; i--) {
            if (arr[i][col] == 1) {
                return false;
            }
        }
        //check left places

        for (int i = rows - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (arr[i][j] == 1) {
                return false;
            }
        }

        //check right dia places

        for (int i = rows - 1, j = col + 1; i >= 0 && j < arr.length; i--, j++) {
            if (arr[i][j] == 1) {
                return false;
            }
        }
        return true;
    }
}
