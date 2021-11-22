package unit_4;

import java.util.HashSet;
import java.util.Scanner;

public class CommonElement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++) {
            arr2[i] = scan.nextInt();
        }
        int count = 0;
        HashSet<Integer> hashSet = new HashSet<>();
        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr2.length; i++) {
                if (arr[j] == arr2[i]) {
                    hashSet.add(arr[j]);
                }
            }
        }
        for (Integer num : hashSet) {
            count++;
        }
        System.out.println(count);
    }
}
