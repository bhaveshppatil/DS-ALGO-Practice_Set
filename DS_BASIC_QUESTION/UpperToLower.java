import java.util.Scanner;

public class UpperToLower {
    public static void main(String[] args) {
        convertUpperToLower();
    }

    public static void convertUpperToLower() {

        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        char[] ch = name.toCharArray();

        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) >= 'A' && name.charAt(i) <= 'Z') {
                ch[i] = (char) (ch[i] + 32);
            }
        }
        for (int i = 0; i < ch.length; i++) {
            System.out.print(ch[i]);
        }
    }
}