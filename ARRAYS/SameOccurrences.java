import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class SameOccurrences {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println(uniqueOccurrences(arr));
    }

    public static boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();

        HashSet<Integer> s = new HashSet<Integer>();

        for (int i = 0; i < arr.length; i++) {
            if (h.containsKey(arr[i])) {
                int x = h.get(arr[i]);
                h.replace(arr[i], x, ++x);
            } else
                h.put(arr[i], 1);
        }

        for (Map.Entry<Integer, Integer> m : h.entrySet()) {
            if (s.contains(m.getValue())) return false;
            s.add(m.getValue());
        }

        return true;
    }
}
