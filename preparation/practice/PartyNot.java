package practice;

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
        boolean isParty = false;

        for (int i = 0; i < n; i++) {
            int count = 0;
            count += arr[i];
            if (count > r){

            }
        }
        if (isParty) {
            System.out.println("Party");
        } else {
            System.out.println("Sad");
        }
    }
}
