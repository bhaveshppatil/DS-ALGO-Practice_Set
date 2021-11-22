package Recursion;

import java.util.Scanner;

public class GenerateSubsequence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String str = "";

        do {
            str = scan.nextLine();
        } while (str.length() != n);

        char[] ch = str.toCharArray();

        generateSubsequence("", ch, 0, n);

    }

    private static void generateSubsequence(String s, char[] ch, int low, int high) {
        if (!s.equals("")) {
            System.out.println(s);
        }

        for (int i = low; i < high; i++) {
            generateSubsequence(s + ch[i], ch, i + 1, high);
        }
    }
}
