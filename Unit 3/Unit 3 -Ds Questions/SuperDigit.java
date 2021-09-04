import java.util.Scanner;

public class SuperDigit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int n = scan.nextInt();

        String num = "";

        while (n != 0) {
            num += str;
            n--;
        }

        int superDigitNum = calculateDigitSum(num);
        System.out.println(superDigitNum);
    }

    private static int calculateDigitSum(String num) {
        int temp = 0;
        if (num.length() == 0) {
            return 0;
        } else if (num.length() == 1) {
            return Integer.parseInt(num);
        }
        for (int i = 0; i < num.length(); i++) {
            temp += charToNumericValue(num);
        }
        return calculateDigitSum(String.valueOf(temp));
    }

    public static int charToNumericValue(String num) {
        int n = 0;
        for (int i = 0; i < num.length(); i++) {
            n = Integer.parseInt(String.valueOf(num.charAt(i)));
        }
        return n;
    }
}
