import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class IndiaRank {
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
                hashMap.put(arr[i], i);
            } else {
                hashMap.put(arr[i], i);
            }
        }

        for (Map.Entry<String, Integer> map : hashMap.entrySet()){
            if (map.getKey().equals("India")){
                System.out.println(map.getValue()+1);
            }
        }

    }
}
