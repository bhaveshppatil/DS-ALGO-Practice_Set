import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class XSubArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        for (int t = 0; t < test; t++) {
            int n = scan.nextInt();
            int k = scan.nextInt();
            int x = scan.nextInt();

            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scan.nextInt();
            }

            HashMap<Integer, Integer> map = new HashMap<>();

            int sum = 0;
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n - x; j++) {
                    if (arr[i] <= k && arr[j] <= k) {
                        map.put(arr[i], arr[j]);
                        sum++;
                    }
                }
            }
            System.out.println(sum);
//            for (Map.Entry<Integer, Integer> hashmap : map.entrySet()) {
//                System.out.println(hashmap.getKey() + " " + hashmap.getValue());
//            }
        }
    }
}
