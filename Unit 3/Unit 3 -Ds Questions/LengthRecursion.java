import java.util.Scanner;

public class LengthRecursion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int count = charTotal(str);
        System.out.println(count);
    }

    private static int charTotal(String str) {
        if (str.equals("")) {
            return 0;
        } else {
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
               count++;
            }
            return count;
        }
    }
}
