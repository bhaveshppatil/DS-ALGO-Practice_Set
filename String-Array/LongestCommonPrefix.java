import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        System.out.println(isValid(str));

    }

    public static boolean isValid(String s) {
        int count = 0;
        char[] ch = s.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            if (ch.length < 2) {
                return false;
            } else {
                for (int j = i + 1; j < i + 2; j++) {
                    if (ch[i] == '(' && ch[j] == ')') {
                        count++;
                    }
                    if (ch[i] == '[' && ch[j] == ']') {
                        count++;
                    }
                    if (ch[i] == '{' && ch[j] == '}') {
                        count++;
                    }
                }
            }
        }
        if (count >= 1) {
            return true;
        } else {
            return false;
        }

    }
}
