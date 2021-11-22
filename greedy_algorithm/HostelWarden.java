package greedy_algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class HostelWarden {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[] students = new int[n];
        for (int i = 0; i < n; i++) {
            students[i] = scan.nextInt();
        }
        int[] rooms = new int[n];
        for (int i = 0; i < n; i++) {
            rooms[i] = scan.nextInt();
        }
        Arrays.sort(students);
        Arrays.sort(rooms);

        int max = 0;

        for (int i = 0; i < n; i++) {
            int temp = Math.abs(students[i] - rooms[i]);
            max = Math.max(temp, max);
        }
        System.out.println(max);
    }
}
