import java.util.Scanner;

public class FactorialRecursion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int factNum = factorialNum(n);
        System.out.println(factNum);

    }

    public static int factorialNum(int n) {
        if (n == 1) {
            return 1;
        } else {
           int num = factorialNum(n - 1) * n;
            return num;
        }
    }
}
