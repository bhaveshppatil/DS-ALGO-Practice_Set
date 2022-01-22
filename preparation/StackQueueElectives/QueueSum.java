package StackQueueElectives;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();

        int queries = scan.nextInt();

        int sum = 0;
        if (queries > 0) {
            int n = scan.nextInt();
            if (n == 1) {
                queue.add(scan.nextInt());
            } else if (n == 2) {
                sum += queue.remove();
            }

            if (queue.isEmpty()) {
                sum = 1;
            }
            System.out.println(sum);
        }
    }
}
