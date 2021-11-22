package greedy_algorithm;

import java.util.Scanner;

public class LoveOfSamosa {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

       int count = countSamosa(arr, k);
        System.out.println(count);

    }

    private static int countSamosa(int[] arr, int k) {
        int sum =0;
        int count =0;
        int i=0;
        while (sum <= k){
            sum = sum+arr[i];
            i++;
            count++;
        }
        return count;
    }
}
