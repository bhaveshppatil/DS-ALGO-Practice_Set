package Recursion;

import java.util.Scanner;

public class SudokuPuzzle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char[][] sudoku = new char[9][9];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                sudoku[i][j] = (char) scan.nextInt();
            }
        }
        solveSudoku(sudoku, 0, 0);
    }

    private static void solveSudoku(char[][] sudoku, int i, int j) {
        if (i == sudoku.length) {
            printSolvedSudoku(sudoku);
            return;
        }
        int numI = 0;
        int numJ = 0;
        if (j == sudoku[0].length - 1) {
            numJ = 0;
            numI = i + 1;
        } else {
            numI = i;
            numJ = j + 1;
        }

        if (sudoku[i][j] != 0) {
            solveSudoku(sudoku, numI, numJ);
        } else {
            for (int number = 1; number <= 9; number++) {
                if (isValid(sudoku, i, j, number)) {
                    sudoku[i][j] = (char) number;
                    solveSudoku(sudoku, numI, numJ);
                    sudoku[i][j] = 0;
                }
            }
        }
    }

    private static void printSolvedSudoku(char[][] sudoku) {
        for (int i = 0; i < sudoku.length; i++) {
            for (int j = 0; j < sudoku.length; j++) {
                System.out.print(sudoku[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static boolean isValid(char[][] sudoku, int n, int m, int num) {
        //check row possibility

        for (int i = 0; i < sudoku[0].length; i++) {
            if (sudoku[n][i] == num) {
                return false;
            }
        }
        // check column possibility

        for (int i = 0; i < sudoku[0].length; i++) {
            if (sudoku[i][m] == num) {
                return false;
            }
        }

        //check 3*3 matrix num
        int boxI = n / 3 * 3;
        int boxJ = m / 3 * 3;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (sudoku[boxI + i][boxJ + j] == num) {
                    return false;
                }
            }
        }
        return true;
    }
}
