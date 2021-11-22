package greedy_algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class ManageStacksBricks {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();

        while (test != 0) {
            int stackOfBrick = scan.nextInt();
            int addBrick = scan.nextInt();
            int removeBrick = scan.nextInt();

            int min = 0;

            while (stackOfBrick != 0) {

                int[] a = new int[stackOfBrick - 1];
                for (int i = 0; i < stackOfBrick - 1; i++) {
                    a[i] = scan.nextInt();
                }
                int[] b = new int[stackOfBrick - 1];
                for (int i = 0; i < stackOfBrick - 1; i++) {
                    b[i] = scan.nextInt();
                }

                Arrays.sort(a);
                Arrays.sort(b);

                for (int i = 0; i < stackOfBrick - 1; i++) {
                    if (a[i] > b[i]) {
                        min += (a[i] - b[i]) * removeBrick;
                    } else {
                        min += (b[i] - a[i]) * addBrick;
                    }
                }
                stackOfBrick--;
            }
            System.out.println(min);

            test--;
        }
    }
}
