package MACTimedContest1;

import java.util.Scanner;

public class CanTheyEqual {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test != 0) {
            int n = scan.nextInt();
            String first = "";
            String second = "";
            do {
                first = scan.next();
            } while (first.length() != n);

            do {
                second = scan.next();
            } while (second.length() != n);

            int firstNum = 0;
            int secondNum = 0;

            for (int i = 0; i < n; i++) {
               firstNum += first.charAt(i);
               secondNum += second.charAt(i);
            }
            if (firstNum == secondNum){
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
            test--;
        }
    }
}
