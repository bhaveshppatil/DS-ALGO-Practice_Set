package greedy_algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class PartyNot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int c = scan.nextInt();
        int r = scan.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        Arrays.sort(arr);
        int sum = 0;
        for (int i = 0; i < c - 1; i++) {
            sum += arr[i];
        }
        if (sum <= r){
            System.out.println("Party");
        }else {
            System.out.println("Sad");
        }
    }
}
