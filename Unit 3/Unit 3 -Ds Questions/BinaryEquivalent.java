import java.util.Scanner;

public class BinaryEquivalent {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test != 0) {
            int n = scan.nextInt();
            long binaryNum = binaryNum(n, test);
            System.out.println(binaryNum);
            test--;
        }
    }

    private static long binaryNum(int n, int test) {
        long convertToBinary = 0;
        while (test != 0) {
            if (n == 0) {
                return 0;
            } else {
                convertToBinary = n % 2 + 10 * binaryNum(n / 2, test);
            }
            test--;
        }
        return convertToBinary;
    }
}
