import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
}

