import java.util.Scanner;

public class Plus {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 0; i < (2 * n + 1); i++) {
            for (int j = 0; j < (2 * n - 1); j++) {
                if (i == n) {
                    System.out.print("* ");
                } else {
                    if (j == n-1) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
    }
}
