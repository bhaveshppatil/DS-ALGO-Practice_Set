import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class IsItHappy {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        for (int t = 0; t < test; t++) {
            int number = scan.nextInt();

            int rem = 0;
            int sum = 0;
            HashSet<Integer> arrayList = new HashSet<>();

            while (arrayList.add(number)) {
                sum = 0;
                while (number >= 1) {
                    rem = number % 10;
                    sum = sum + (rem * rem);
                    number /= 10;
                }
                number = sum;
            }

            if (sum == 1) {
                System.out.println(true);
            } else {
                System.out.println(false);
            }
        }
    }
}
