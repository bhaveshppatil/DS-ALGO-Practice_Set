package ThemedContest;

import java.util.Scanner;

public class RailFence {

    public static void main(String[] args) {
        String str, ciphertxt;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the message to be encrypted");

        str = scan.nextLine();
        int len = str.length();
        String start = "", end = "", temp = "";
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) != ' ')
                temp = temp + str.charAt(i);
        }
        for (int i = 0; i < temp.length(); i++) {
            if (i % 2 == 0)
                start = start + temp.charAt(i);
            else
                end = end + temp.charAt(i);
        }
        ciphertxt = start.concat(end);

        System.out.println("Ciphertext : " + ciphertxt);
        str = "";
        int k, j;
        if (ciphertxt.length() % 2 == 0)
            j = ciphertxt.length() / 2;
        else
            j = ciphertxt.length() / 2 + 1;
        k = j;
        for (int i = 0; i < k; i++, j++) {
            str += ciphertxt.charAt(i);
            str += ciphertxt.charAt(j);
        }
        System.out.println("Plaintext: " + str);
    }
}
