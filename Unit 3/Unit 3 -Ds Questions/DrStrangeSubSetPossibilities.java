import java.util.Scanner;

public class DrStrangeSubSetPossibilities {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        possibleSubset("", n);
    }

    private static void possibleSubset(String s, int n) {
        if (n == 1) {
            System.out.println(n);
        }
    }
}
