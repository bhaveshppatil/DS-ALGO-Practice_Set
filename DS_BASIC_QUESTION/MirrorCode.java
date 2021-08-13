import java.util.Scanner;

public class MirrorCode {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        char[] ch = word.toCharArray();

        String output = "";

        for (int i = 0; i < ch.length; i++) {
            output += (char) (122 - (word.charAt(i) - 97));
        }
        System.out.println(output);

    }
}



/*
        String[] list = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        int index = 0;
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < ch.length; j++) {
                if (list[i].length() == ch[j]) {
                    index = 25 - ch[j];
                }
            }
      }

 */





/*
for (int j = 0; j < ch.length; j++) {
            if (ch[j] == 'a') {
                ch[j] = (char) (ch[j] + 25);
            } else if (ch[j] == 'b') {
                ch[j] = (char) (ch[j] + 23);
            } else if (ch[j] == 'c') {
                ch[j] = (char) (ch[j] + 21);
            } else if (ch[j] == 'd') {
                ch[j] = (char) (ch[j] + 19);
            } else if (ch[j] == 'e') {
                ch[j] = (char) (ch[j] + 17);
            } else if (ch[j] == 'f') {
                ch[j] = (char) (ch[j] + 15);
            } else if (ch[j] == 'g') {
                ch[j] = (char) (ch[j] + 13);
            } else if (ch[j] == 'h') {
                ch[j] = (char) (ch[j] + 11);
            } else if (ch[j] == 'i') {
                ch[j] = (char) (ch[j] + 9);
            } else if (ch[j] == 'j') {
                ch[j] = (char) (ch[j] + 7);
            } else if (ch[j] == 'k') {
                ch[j] = (char) (ch[j] + 5);
            } else if (ch[j] == 'l') {
                ch[j] = (char) (ch[j] + 3);
            } else if (ch[j] == 'm') {
                ch[j] = (char) (ch[j] + 1);
            } else if (ch[j] == 'n') {
                ch[j] = (char) (ch[j] - 1);
            } else if (ch[j] == 'o') {
                ch[j] = (char) (ch[j] - 3);
            } else if (ch[j] == 'p') {
                ch[j] = (char) (ch[j] - 5);
            } else if (ch[j] == 'q') {
                ch[j] = (char) (ch[j] - 7);
            } else if (ch[j] == 'r') {
                ch[j] = (char) (ch[j] - 9);
            } else if (ch[j] == 's') {
                ch[j] = (char) (ch[j] - 11);
            } else if (ch[j] == 't') {
                ch[j] = (char) (ch[j] - 13);
            } else if (ch[j] == 'u') {
                ch[j] = (char) (ch[j] - 15);
            } else if (ch[j] == 'v') {
                ch[j] = (char) (ch[j] - 17);
            } else if (ch[j] == 'w') {
                ch[j] = (char) (ch[j] - 19);
            } else if (ch[j] == 'x') {
                ch[j] = (char) (ch[j] - 21);
            } else if (ch[j] == 'y') {
                ch[j] = (char) (ch[j] - 23);
            } else if (ch[j] == 'z') {
                ch[j] = (char) (ch[j] - 25);
            }

        }
        for (int i = 0; i < ch.length; i++) {
            System.out.print(ch[i]);
        }

 */