import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class QueueSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Queue<Integer> queue = new PriorityQueue<>();
        int sum = 0;
        int test = scan.nextInt();

        while (test != 0) {

            int num = scan.nextInt();

            if (num == 1) {
                int n = scan.nextInt();
                sum += n;
                queue.add(n);
            }
            if (num == 2) {
                if (!queue.isEmpty()) {
                    queue.remove();
                }
                if (queue.isEmpty()) {
                    sum -= 1;
                }
                if (sum !=0){
                    System.out.println(sum);
                }
            }

            test--;
        }
    }
}
