package greedy_algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class DanceNight {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test != 0) {
            int m = scan.nextInt();
            int n = scan.nextInt();

            int[] heightOfBoys = new int[m];

            for (int i = 0; i < m; i++) {
                heightOfBoys[i] = scan.nextInt();
            }

            int[] heightOfGirl = new int[n];

            for (int i = 0; i < n; i++) {
                heightOfGirl[i] = scan.nextInt();
            }
            boolean isHeightMatch = danceNight(heightOfBoys, heightOfGirl);
            test--;
        }
    }

    private static boolean danceNight(int[] heightOfBoys, int[] heightOfGirl) {
        Arrays.sort(heightOfBoys);
        Arrays.sort(heightOfGirl);
        return true;
    }
}
