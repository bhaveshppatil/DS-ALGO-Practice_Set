package Themed_Contest_3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AlanFrequency {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
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
            }else {
                hashMap.put(ch[i], 1);
            }
        }

        for (Map.Entry<Character, Integer> map : hashMap.entrySet()){
            System.out.println(map.getKey() + "-" + map.getValue());
        }
    }
}
