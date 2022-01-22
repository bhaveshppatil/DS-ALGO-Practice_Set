package practice;

import java.util.Scanner;

public class AnagramDetector {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String str2 = scan.nextLine();

        int countStr1 = 0;
        int countStr2 = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                countStr1 += str.charAt(i);
            }
        }
        for (int i = 0; i < str2.length(); i++) {
            if (str2.charAt(i) != ' '){
                countStr2 += str2.charAt(i);
            }
        }
        if (countStr1 == countStr2){
            System.out.println("True");
        }else {
            System.out.println("False");
        }
    }
}
