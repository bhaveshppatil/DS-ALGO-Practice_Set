package ThemedContest;

import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test != 0) {
            int n = scan.nextInt();
            String str = "";

            do {
                str = scan.next();
            } while (str.length() != n);

            String reverseStr = "";

            for (int i = str.length() - 1; i >= 0; i--) {
                reverseStr += str.charAt(i);
            }
            if (reverseStr.equals(str)) {
                System.out.println("Possible!");
            } else {
                System.out.println("Not Possible!");
            }
        }
    }
}
