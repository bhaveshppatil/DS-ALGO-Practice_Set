import java.util.Scanner;

public class AllSubString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                String count = "";
                for (int k = i; k < j; k++) {
                    count = count + str.charAt(k);
                }
                System.out.println(count);

            }
        }
    }
}
