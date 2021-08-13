import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AlanFrequency {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String str = "";
        do {
            str = scan.nextLine();
        } while (str.length() != n);

        char[] ch = str.toCharArray();

        HashMap<Character, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < ch.length; i++){
            if (hashMap.containsKey(ch[i])){
                int count = hashMap.get(ch[i]);
                count++;
                hashMap.put(ch[i], count);
            }else {
                hashMap.put(ch[i], 1);
            }
        }
        for (Map.Entry<Character, Integer> map : hashMap.entrySet()){
            System.out.println(map.getKey() + "-" + map.getValue());
        }
    }
}
