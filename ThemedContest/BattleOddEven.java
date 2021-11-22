package ThemedContest;

import java.util.Scanner;

public class BattleOddEven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        int oddSum = 0;
        int evenSum = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0){
                evenSum += arr[i];
            }else {
                oddSum += arr[i];
            }
        }
        if (oddSum > evenSum){
            System.out.println("Odd");
        }else {
            System.out.println("Even");
        }
    }
}
