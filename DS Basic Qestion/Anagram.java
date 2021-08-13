import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word1 = scan.nextLine();
        String word2 = scan.nextLine();

        int count = 0;
        for (int i = 0; i < word1.length(); i++) {
            char ch = word1.charAt(i);
            if (ch != ' ') {
                count += ch;
            }
        }
        int count2 = 0;
        for (int i = 0; i < word2.length(); i++) {
            char ch = word2.charAt(i);
            if (ch != ' ') {
                count2+=ch;
            }
        }

        if (count == count2){
            System.out.println("True");
        }else {
            System.out.println("False");
        }

    }
}
