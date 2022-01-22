package ThemedContest;


/*
Today, your task is to encrypt and print the encrypted string. You will be given a single line which contains alphabets, numbers and symbols, followed by a number K.
You need to encrypt it in a way such that every character in the string is rotated by the given fixed number K.

Only encrypt Alphabets and Numbers. (A-Z, a-z, and 0-9) . All Symbols, such as - ,; %, should remain unencrypted.

Output
Print the encrypted string.

Sample Input 1
All-convoYs-9-be:Alert1.
4

Sample Output 1
Epp-gsrzsCw-3-fi:Epivx5.


Hint
Sample 1 Explanation

A becomes E, Y becomes C, 9 becomes 3,



*/
import java.util.Scanner;

public class EncryptIt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int k = scan.nextInt();
        char[] ch = str.toCharArray();
        String encryptedStr = "";
        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                char lower = (char) (((int) str.charAt(i) + k - 97) % 26 + 97);
                encryptedStr += lower;

            } else if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                char upper = (char) (((int) str.charAt(i) + k - 65) % 26 + 65);
                encryptedStr += upper;
            } else if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                char number = (char) (((int) str.charAt(i) +
                        k - 48) % 10 + 48);
                encryptedStr += number;
            } else {
                encryptedStr += str.charAt(i);
            }
        }
        System.out.println(encryptedStr);
    }
}