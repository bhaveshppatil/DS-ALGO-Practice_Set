package MACTimedContest1;

import java.util.Scanner;

public class NearPalindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test != 0) {
            int n = scan.nextInt();
            int k = scan.nextInt();
            String str = "";
            do {
                str += scan.next();
            } while (str.length() != n);

            checkNearPalindrome(str, k);
            test--;
        }
    }

    private static void checkNearPalindrome(String str, int k) {
        int start = 0;
        int end = str.length() - 1;
        char lower = ' ';
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                lower = (char) ((str.charAt(end) - k - 97) % 26 + 97);
                if (str.charAt(start) == lower){
                    System.out.println("True");
                }else {
                    System.out.println("False");
                }
                break;
            }
            start++;
            end--;
        }
    }
}
