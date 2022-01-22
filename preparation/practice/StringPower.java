package practice;

import java.util.Scanner;

public class StringPower {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test != 0){
            String str = scan.next();
            int i = 0, ans = 0;
            while (i < str.length()){
                int j = i;
                int count = 0;
                while (j <str.length() && str.charAt(j) == str.charAt(i)){
                    j++;
                    count++;
                }

            }
            test--;
        }
    }
}
