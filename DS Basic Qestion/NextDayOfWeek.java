import java.util.Scanner;

public class NextDayOfWeek {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String day = scan.next();
        int num = scan.nextInt();

        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        for (int i = 0; i < days.length; i++) {
            if (day.equals(days[i])) {
                int position = i + num;
                int nextDay = position % 7;
                System.out.println(days[nextDay]);
            }
        }
    }
}