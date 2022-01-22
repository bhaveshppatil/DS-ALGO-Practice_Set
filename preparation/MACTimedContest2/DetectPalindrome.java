package MACTimedContest2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DetectPalindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test != 0) {
            int n = scan.nextInt();
            String str = "";

            do {
                str = scan.next();
            } while (str.length() != n);

            HashMap<Character, Integer> hashMap = new HashMap<>();
            char[] ch = str.toCharArray();

            for (int i = 0; i < ch.length; i++) {
                if (hashMap.containsKey(ch[i])) {
                    int count = hashMap.get(ch[i]);
                    hashMap.put(ch[i], count + 1);
                } else {
                    hashMap.put(ch[i], 1);
                }
            }
            int count = 0;
            for (Map.Entry<Character, Integer> map : hashMap.entrySet()) {
                if (map.getValue() % 2 == 1) {
                    count++;
                }
            }
            if (count >= 2) {
                System.out.println("Not Possible");
            } else {
                System.out.println("Possible");
            }
            test--;
        }
    }
}
