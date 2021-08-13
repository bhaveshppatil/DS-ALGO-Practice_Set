import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NextDay {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String day = scan.nextLine();
        int num = scan.nextInt();

        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        HashMap<String, Integer> hashMap = new HashMap<>();
        int value = 0;
        for (int i = 0; i < days.length; i++) {
            hashMap.put(days[i], i);
        }
        for (Map.Entry<String, Integer> map : hashMap.entrySet()) {
            if (day.equals(map.getKey())) {
                int dayPosition = map.getValue() + num;
                int nextDay = dayPosition % 7;
                System.out.println(days[nextDay]);
            }
        }
    }
}
/*
 String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        for (int i = 0; i < days.length; i++) {
            if (day.equals(days[i])) {
                int dayPosition = i + num;
                int nextDay = dayPosition % 7;
                System.out.println(days[nextDay]);
            }
        }
 */