import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class NewYearCelebration {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int queries = scan.nextInt();

        Stack<Integer> stack = new Stack<>();
        Queue<Integer> queue = new LinkedList<Integer>();

        for (int q = 0; q < queries; q++) {
            if (queries == 1) {
                queue.add(scan.nextInt());
            } else if (queries == 2) {
                stack.push(scan.nextInt());
            }
        }
    }
}
