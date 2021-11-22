package Recursion;

import java.util.Scanner;

public class GeneratePermutations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] arr = new int[n];
        String str = "";

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
            str += String.valueOf(arr[i]);
        }

        generatePermute(str, 0, arr.length - 1);
    }

    private static void generatePermute(String str, int low, int high) {

        if (low == str.length()) {
            printPermute(str);
            return;
        } else {
            for (int i = low; i <= high; i++) {
                str = swap(str, i, low);
                generatePermute(str, low + 1, high);
            }
        }
    }

    private static String swap(String str, int low, int high) {
        char temp;
        char[] chArr = str.toCharArray();
        temp = chArr[low];
        chArr[low] = chArr[high];
        chArr[high] = temp;
        return String.valueOf(chArr);
    }

    private static void printPermute(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }
}
