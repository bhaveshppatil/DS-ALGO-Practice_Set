import java.util.Scanner;

public class ImplementGCD {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test != 0) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int GCD = commonDivNum(a, b, test);
            System.out.println(GCD);
            test--;
        }
    }

    private static int commonDivNum(int a, int b, int test) {
        int GCommonN = 0;
        while (test != 0) {
            if (a == 0) {
                return b;
            }else {
                GCommonN = commonDivNum(b % a, a, test);
            }
            test--;
        }
        return GCommonN;
    }
}
