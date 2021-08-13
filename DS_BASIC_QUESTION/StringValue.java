import java.util.Scanner;

public class StringValue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();

        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = (char) (str.charAt(i) - 'a' + 1);
            //'a' -'a' +1 --> 97 -97 +1 ,     'b' - 'a' +1 --> 98 -97 +1
            sum += ch;
        }
        System.out.println(sum);
    }
}
