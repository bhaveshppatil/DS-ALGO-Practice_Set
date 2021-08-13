import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NumberOccure {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (hashMap.containsKey(arr[i])) {
                int count = hashMap.get(arr[i]);
                count++;
                hashMap.put(arr[i], count);
            } else {
                hashMap.put(arr[i], 1);
            }
        }
        int countMax = 0;
        int value =0;
        for (Map.Entry<Integer, Integer> map : hashMap.entrySet()) {
            if (countMax < map.getValue()){
                value = map.getKey();
                countMax = map.getValue();
            }
        }
        System.out.println(value);
    }
}
