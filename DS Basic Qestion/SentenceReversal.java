import java.util.Scanner;

public class SentenceReversal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String sen = scan.nextLine();
        String[] word = sen.split(" ");
        String output = "";
        for (int i = word.length-1; i >= 0; i--) {
            output += word[i]+ " ";

        }
        System.out.println(output);
    }
}
