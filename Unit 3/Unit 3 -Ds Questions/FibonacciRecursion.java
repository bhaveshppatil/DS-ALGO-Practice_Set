import java.util.Scanner;

public class FibonacciRecursion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int fibNum = fibonacci(num);
        System.out.println(fibNum);

    }

    private static int fibonacci(int num) {
        if (num <= 1) {
            return num;
        } else {
            int fib = fibonacci(num - 1) + fibonacci(num - 2);
            return fib;
        }
    }
}
