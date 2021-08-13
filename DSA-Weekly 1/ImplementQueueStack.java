import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class ImplementQueueStack {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int test = scan.nextInt();
        while (test != 0) {
            Queue<Integer> queue = new PriorityQueue<>();

            int n = scan.nextInt();

            switch (n){
                case 0:
                    int k = scan.nextInt();
                    queue.add(k);
                    break;
                case 2:
                   int remove = queue.remove();
                    System.out.println(remove);
                    break;
                case 1:

            }
            test--;
        }
    }
}
