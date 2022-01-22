package practice;

import java.util.Scanner;

public class UniqueWaysCoinChange {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int amount = scan.nextInt();
        int coin = scan.nextInt();
        int[] arr = new int[coin];
        for (int i = 0; i < coin; i++) {
            arr[i] = scan.nextInt();
        }
        int totalWays = countTotalWays(arr, amount);
        System.out.println(totalWays);
    }

    private static int countTotalWays(int[] arr, int amt) {
        int[] count = new int[amt + 1];
        count[0] = 1;
        for (int i = 1; i <= amt; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i >= arr[j]) {
                    count[i] += count[i - arr[j]];
                }
            }
        }
        return count[amt];
    }
}
