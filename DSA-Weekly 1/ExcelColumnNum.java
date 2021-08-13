import java.util.Scanner;

public class ExcelColumnNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        for (int t = 0; t < test; t++) {
            String str = scan.next();

            int ECNumber = 0;

            for (int i = 0; i < str.length(); i++) {
                ECNumber = ECNumber * 26 + str.charAt(i) - 'A' + 1;
            }
            System.out.println(ECNumber);
        }
    }
}

