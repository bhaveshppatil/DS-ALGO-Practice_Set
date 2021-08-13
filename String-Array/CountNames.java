import javax.swing.*;
import java.util.*;

public class CountNames {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.next();
        }
        Arrays.sort(arr);
        LinkedHashMap<String, Integer> hashmap = new LinkedHashMap<>();
        for (int i = 0; i < arr.length; i++) {

            if (hashmap.containsKey(arr[i])) {
                int count = hashmap.get(arr[i]);
                count++;
                hashmap.put(arr[i], count);
            } else {
                hashmap.put(arr[i], 1);
            }
        }
        int max = 0;
        for (Map.Entry<String, Integer> map : hashmap.entrySet()) {
            System.out.println(map.getKey() + " " + map.getValue());
        }
    }
}
