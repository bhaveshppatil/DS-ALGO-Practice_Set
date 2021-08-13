import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class hackLeadBoard {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        for (int t = 0; t < test; t++) {
            String name = scan.next();
            int marks = scan.nextInt();

            HashMap<String, Integer> hashMap = new HashMap<>();
            hashMap.put(name, marks);


            int count = 0;
            for (Map.Entry<String, Integer> map : hashMap.entrySet()) {
                if (map.getValue() > count) {
                    count = map.getValue();
                    System.out.println(count);
                }
            }
        }
    }
}
