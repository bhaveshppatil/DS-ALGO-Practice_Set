import java.util.Scanner;

public class DivisibleNumber {
    public static void main(String[] args) {
        isDivisible();
    }

    public static void isDivisible() {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        if (n % 7 == 0) {
            System.out.println(n + " is divisible by 7");
        } else {
            System.out.println(n + " is not divisible by 7");
        }
    }
}
