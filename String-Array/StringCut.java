import java.util.Scanner;

public class StringCut {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        char[] str2 = str.toCharArray();

        int count = 0;
        for (int i = 0; i < str2.length; i++) {
            count++;
        }
        String arr = "";
        if (count % 2 == 1) {
            for (int i = 0; i < str2.length / 2 + 1; i++) {
                arr += str.charAt(i);
            }
            for (int i = arr.length() - 1; i >= 0; i--) {
                System.out.print(arr.charAt(i));
            }
        }
        if (count % 2 ==0){

            String reverseChar = "";
            for (int i = str2.length - 1; i > str2.length / 2; i--) {
                reverseChar += str.charAt(i);
            }
            System.out.print(reverseChar);
        }
    }
}
