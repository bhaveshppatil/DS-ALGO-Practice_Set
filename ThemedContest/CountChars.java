package ThemedContest;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountChars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        char ch[] = str.toCharArray();

        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < ch.length; i++) {
            if (hashMap.containsKey(ch[i])) {
                int count = hashMap.get(ch[i]);
                hashMap.put(ch[i], count + 1);
            }else {
                hashMap.put(ch[i], 1);
            }
        }
        for (Map.Entry<Character, Integer> map : hashMap.entrySet()){
            System.out.print(map.getKey() + "" + map.getValue());
        }
        System.out.println();
    }
}
