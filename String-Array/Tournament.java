import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Tournament {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scan.next();
        }
        HashMap<String, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (hashMap.containsKey(arr[i])) {
                int count = hashMap.get(arr[i]);
                count++;
                hashMap.put(arr[i], count);
            } else {
                hashMap.put(arr[i], 1);
            }
        }
        int max = 0;
        String total = "";
        for (Map.Entry<String, Integer> map : hashMap.entrySet()){
            if (max < map.getValue()){
                total = map.getKey();
                max = map.getValue();
            }
        }
        System.out.println(total);
    }
}
