import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        for (int t = 0; t < test; t++) {

            int length = scan.nextInt();
            String str = "";
            do {
                str = scan.nextLine();
            } while (str.length() != length);

            char[] ch = str.toCharArray();

            HashMap<Character, Integer> hashMap = new HashMap<>();

            for (int i = 0; i < ch.length; i++) {
                if (hashMap.containsKey(ch[i])) {
                    int count = hashMap.get(ch[i]);
                    count++;
                    hashMap.put(ch[i], count);
                } else {
                    hashMap.put(ch[i], 1);
                }
            }
            int count = 0;
            for (Map.Entry<Character, Integer> map : hashMap.entrySet()) {
                if (map.getValue() % 2 == 1) {
                    count++;
                }
            }
            if (count >=2){
                System.out.println("Not Possible");
            }else {
                System.out.println("Possible");
            }
        }
    }
}