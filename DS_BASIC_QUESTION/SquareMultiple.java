import java.util.Scanner;

public class SquareMultiple {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        for (int i = 1; i <= n; i += 1) {
            for (int j = 1; j <= n; j ++) {

                System.out.print(i * j + " ");
            }
            System.out.println();
        }
    }
}
