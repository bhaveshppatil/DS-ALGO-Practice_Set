import java.util.Scanner;

public class RemoveChar {
    public static void main(String[] args) {
        removeChar();
    }

    public static void removeChar() {
        Scanner scan = new Scanner(System.in);

        String name = scan.next();
        char ch = scan.next().charAt(0);
        char[] str = name.toCharArray();

        for (int i = 0; i < str.length; i++) {
            if (str[i] != ch) {
                System.out.print(str[i]);
            }
        }

    }
}
