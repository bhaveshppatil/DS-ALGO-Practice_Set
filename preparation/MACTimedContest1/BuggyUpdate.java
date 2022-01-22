package MACTimedContest1;

import java.util.Scanner;

public class BuggyUpdate {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test != 0) {
            String current = scan.next();
            String update = scan.next();

            String output = buggyUpdate(current, update);
            System.out.println(output);
            test--;
        }
    }

    private static String buggyUpdate(String current, String update) {
        int length = current.length();
        char[] cch = current.toCharArray();
        char[] uch = update.toCharArray();
        for (int i = 0; i < cch.length; i++) {
          if (cch[i] == uch[i] && cch[i] != '.'){
              return "True";
          }
        }
        return "False";
    }
}
