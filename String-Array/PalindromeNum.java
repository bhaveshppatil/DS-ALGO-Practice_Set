import java.util.Scanner;

public class PalindromeNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

       int  palindrome = num;
        int reverseNum =0;

        while (num != 0) {
            int rem = num % 10;
            reverseNum = reverseNum * 10 + rem;
            num /=10;
        }

        if (palindrome == reverseNum){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }

    }
}
