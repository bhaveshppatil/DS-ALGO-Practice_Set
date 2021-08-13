import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if (count == 1) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
