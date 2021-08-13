import java.util.Scanner;

public class ConvertToLowercase {
    public static void main(String[] args) {
        convertToLowercase();

    }

    public static void convertToLowercase() {
        Scanner scan = new Scanner(System.in);
        /*
        System.out.println("Enter Character");
        char ch = scan.next().charAt(0);
*/

        System.out.println("Enter String");
        String word = scan.next();
        char[] name = word.toCharArray();

        for (int i = 0; i < name.length; i++) {
            if (word.charAt(i) >= 'A' && word.charAt(i) <= 'Z') {
                name[i] = (char) (name[i] + 32);
            }
        }
        for (int i = 0; i < name.length; i++) {
            System.out.print(name[i]);
        }
        /*
        System.out.println();

        char upperChar = (char) (ch + 32);
        System.out.println(upperChar);

         */
    }
}
