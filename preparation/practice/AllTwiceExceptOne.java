package practice;


//https://oj.masaischool.com/contest/2665/problem/01

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AllTwiceExceptOne {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test != 0) {
            int n = scan.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scan.nextInt();
            }
            findUniqueOne(arr, n);
            test--;
        }
    }

    public static void findUniqueOne(int[] arr, int n) {

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (hashMap.containsKey(arr[i])) {
                int count = hashMap.get(arr[i]);
                hashMap.put(arr[i], count + 1);
            } else {
                hashMap.put(arr[i], 1);
            }
        }
        int unique = 0;
        for (Map.Entry<Integer, Integer> map : hashMap.entrySet()) {
            if (map.getValue() == 1) {
                unique = map.getKey();

            }
        }
        System.out.println(unique);
    }
}
