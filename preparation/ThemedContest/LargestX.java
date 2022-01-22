package ThemedContest;

import java.util.Scanner;

public class LargestX {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test != 0) {

            int n = scan.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scan.nextInt();
            }
            int largest = arr[0];
            int smallest = arr[0];

            for (int i = 0; i < n; i++) {
                if (arr[i] < smallest) {
                    smallest = arr[i];
                }
                if (arr[i] > largest) {
                    largest = arr[i];
                }
            }
            System.out.println(largest);
//            System.out.println(smallest);
            /*if (largest == (-smallest)){
                System.out.println(largest);
            }else {
                System.out.println(-1);
            }*/
            test--;
        }
    }
}
