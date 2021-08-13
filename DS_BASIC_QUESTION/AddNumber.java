import java.util.Scanner;

public class AddNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        int addNum = addTwoNumbers(a, b);
        System.out.println("Sum of first two numbers is "+ addNum);
        int addThreeNum = addThreeNumbers(a, b, c);
        System.out.println("Sum of first three numbers is "+ addThreeNum);
    }

    private static int addThreeNumbers(int a, int b, int c) {
        return a + b + c;
    }

    public static int addTwoNumbers(int a, int b) {
        return a + b;
    }
}
