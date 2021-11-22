package DSA_Context_Random;

import java.util.Arrays;
import java.util.Scanner;

public class DanceNight {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();

        int[] boyHeight = new int[n];
        for (int i = 0; i < n; i++) {
            boyHeight[i] = scan.nextInt();
        }
        int[] girlHeight = new int[n];
        for (int i = 0; i < n; i++) {
            girlHeight[i] = scan.nextInt();
        }
        boolean isMatched = danceNight(boyHeight, girlHeight);
        if (isMatched){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }

    private static boolean danceNight(int[] boyHeight, int[] girlHeight) {

        Arrays.sort(boyHeight);
        Arrays.sort(girlHeight);

        int i = 0, j = 0;
        while (i < boyHeight.length && j < girlHeight.length) {
            if (boyHeight[i] <= girlHeight[i]) {
                return false;
            }
            i++;
            j++;
        }
        return true;
    }
}
