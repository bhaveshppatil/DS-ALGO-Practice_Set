import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int power = 1;
        int a = scan.nextInt();
        int b = scan.nextInt();

        for (int i = 1; i <= b; i++) {
            power = power * a;

        }
        System.out.println(power);
    }

}
