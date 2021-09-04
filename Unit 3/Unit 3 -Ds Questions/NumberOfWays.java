import java.util.Scanner;

public class NumberOfWays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int waysCont = numberOFWays(num);
        System.out.println(waysCont);
    }

    private static int numberOFWays(int num) {
        if (num == 0) {
            return 1;
        } else if (num < 0) {
            return 0;
        } else {
            int count = numberOFWays(num - 1) + numberOFWays(num - 2) + numberOFWays(num - 3);
            return count;
        }
    }
}