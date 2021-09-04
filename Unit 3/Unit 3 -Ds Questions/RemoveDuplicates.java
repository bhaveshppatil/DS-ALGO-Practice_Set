import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        for (int i = 0; i < test; i++) {
            String str = scan.nextLine();

            String output = removeDuplicates(str);
            System.out.println(output);
        }
    }

    private static String removeDuplicates(String str) {
        String result = "";

        if (str.length() == 0) {
            return "Empty String";
        } else {
            for (int i = 0; i < str.length(); i++) {
                if (i == 0) {
                    if (str.charAt(i) != str.charAt(i + 1)) {
                        result = result + str.charAt(i);
                    }
                }

                if (i == str.length() - 1) {

                    if (str.charAt(i) != str.charAt(i - 1)) {
                        result = result + str.charAt(i);
                    } else if (str.charAt(i) != str.charAt(i - 1) && str.charAt(i) != str.charAt(i + 1)) {
                        result = result + str.charAt(i);
                    }
                }
            }
        }
        return result;
    }
}
