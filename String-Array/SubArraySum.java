import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SubArraySum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int k = scan.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i <= n - k; i++) {
            int sum = 0;
            for (int j = i; j < k + i; j++) {
                sum += arr[j];
                arrayList.add(sum);
            }
        }
        int max = Collections.max(arrayList);
        if (max % k != 0) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}





/*
  int count = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum =+ arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                sum += arr[j];
                if (sum / k == 0) {
                    count++;
                }
            }
        }
        System.out.println(count);
 */