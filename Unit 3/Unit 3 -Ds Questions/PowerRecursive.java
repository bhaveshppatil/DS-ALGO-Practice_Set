import java.util.Scanner;

public class PowerRecursive {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int baseVal = scan.nextInt();

        int powerOfVal = calPower(num, baseVal);
        System.out.println(powerOfVal);

    }

    private static int calPower(int num, int baseVal) {
        if (baseVal == 0) {
            return 1;
        } else {
            int value = num * calPower(num, baseVal - 1);
            return value;
        }
    }
}
