import java.util.Scanner;

public class TicTacToeWinner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char[][] matrix = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = scan.next().charAt(0);
            }
        }


        int countX = 0;
        int countO = 0;

        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][0] == 'x' && matrix[i][1] == 'x' && matrix[i][2] == 'x'
                    || matrix[0][0] == 'x' && matrix[1][1] == 'x' && matrix[2][2] == 'x'
                    || matrix[0][2] == 'x' && matrix[1][1] == 'x' && matrix[2][0] == 'x') {
                countX++;
            }
            if (matrix[i][0] == 'o' && matrix[i][1] == 'o' && matrix[i][2] == 'o'
                    || matrix[0][0] == 'o' && matrix[1][1] == 'o' && matrix[2][2] == 'o'
                    || matrix[0][2] == 'o' && matrix[1][1] == 'o' && matrix[2][0] == 'o') {
                countO++;
            }
        }

        if (countX == 1) {
            System.out.println("x");
        } else if (countO == 1) {
            System.out.println("o");
        } else {
            System.out.println("Tie");
        }
    }
}