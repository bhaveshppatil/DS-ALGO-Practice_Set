import java.util.Scanner;

public class StringCut {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        char[] str2 = str.toCharArray();

        String FStrCut = "";

        if (str2.length % 2 == 1) {
            for (int i = 0; i < str2.length / 2 + 1; i++) {
                FStrCut += str2[i];
            }
            for (int i = FStrCut.length() - 1; i >= 0; i--) {
                System.out.print(FStrCut.charAt(i));
            }
            for (int i = str2.length - 1; i > str2.length / 2; i--) {
                System.out.print(str2[i]);
            }
        }
        String FCut = "";
        if (str2.length % 2 == 0) {
            for (int i = 0; i < str2.length / 2; i++) {
                FCut += str2[i];
            }
            for (int i = FCut.length() - 1; i >= 0; i--) {
                System.out.print(FCut.charAt(i));
            }
            for (int i = str2.length - 1; i >= str2.length / 2; i--) {
                System.out.print(str2[i]);
            }
        }
        System.out.println();
    }
}
