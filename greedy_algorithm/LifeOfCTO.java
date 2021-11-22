package greedy_algorithm;

import java.util.Scanner;

public class LifeOfCTO {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[] buggyVersion = new int[n];
        for (int i = 0; i < n; i++) {
            buggyVersion[i] = scan.nextInt();
        }
        int buggyProduct = 1;
        int count =0;
        for (int i = 0; i < n; i++) {
            if (buggyVersion[i] == buggyProduct){
                count = i;
                break;
            }else {
                count = -1;
            }
        }
        System.out.println(count);
    }
}
