package MACTimedContest1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AnagramPairs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test != 0) {
            int n = scan.nextInt();
            String[] str = new String[n];
            for (int i = 0; i < str.length; i++) {
                str[i] = scan.next();
            }

            int numberOfPairs = findAnagramPairs(str, n);
            System.out.println(numberOfPairs);
            test--;
        }
    }

    private static int findAnagramPairs(String[] str, int n) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < str.length; i++) {
            char[] ch = str[i].toCharArray();
            Arrays.sort(ch);
            str[i] = new String(ch);
            if (hashMap.containsKey(str[i])) {
                int count = hashMap.get(str[i]);
                hashMap.put(str[i], count + 1);
            } else {
                hashMap.put(str[i], 1);
            }
        }
        int res = 0;
        for (Map.Entry<String, Integer> map : hashMap.entrySet()) {
            int value = map.getValue();
            res += (value * (value - 1) / 2);
        }
        return res;
    }
}
