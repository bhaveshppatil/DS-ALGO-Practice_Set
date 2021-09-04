import java.util.Scanner;

public class NickHacks {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test != 0) {
            int rupees = scan.nextInt();

            if (hacks(rupees, 1)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
            test--;
        }
    }

    private static boolean hacks(int rupees, int n) {
        if (rupees == n) {
            return true;
        } else if (rupees < n) {
            return false;
        } else return hacks(rupees, n * 10) || hacks(rupees, n * 20);
    }
}
