package practice.Subarray_Questions;

import java.util.HashMap;
import java.util.Scanner;

public class LongestUniqueSubStr {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int max_unique_len = findLongestUniqueStr(str);
        System.out.println(max_unique_len);
    }

    private static int findLongestUniqueStr(String str) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        int max_length = 0;
        int start = 0;
        for (int i = 0; i < str.length(); i++) {
            if (hashMap.containsKey(str.charAt(i))) {
                start = Math.max(start, hashMap.get(str.charAt(i)) + 1);
            } else {
                hashMap.put(str.charAt(i), i);
                max_length = Math.max(max_length, i - start + 1);
            }
        }
        return max_length;
    }
}
