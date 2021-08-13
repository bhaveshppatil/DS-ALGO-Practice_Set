import java.util.Scanner;

public class StringPalindrome {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        String str = scan.nextLine();
        char[] arr = str.toCharArray();

        String palin = "";

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                palin += str.charAt(i);
            }
        }
        int LtoR = 0;
        int RtoL = 0;

        char[] ch = palin.toCharArray();

        for (int i = 0; i < ch.length ; i++){
            LtoR += palin.charAt(i);
        }
        for (int i = ch.length - 1; i >= 0; i--) {
            RtoL += palin.charAt(i);
        }

        if (LtoR == RtoL) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
