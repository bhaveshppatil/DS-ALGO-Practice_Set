import java.util.Scanner;

public class FamousNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int k = scan.nextInt();

        String str2 = "";

        for (int i = 0; i < k; i++) {
            str2 = str.concat(str2);
        }

        long digits = Long.parseLong(str2);
        long result = theFamousNum(digits);
        System.out.println(result);
    }

    private static long theFamousNum(long digits) {
        long digitSum = 0;
        if (digits % 10 == 0) {
            return digits;
        } else {
            digitSum = digits % 10 + theFamousNum(digits / 10);
        }
        return digitSum;
    }

}
