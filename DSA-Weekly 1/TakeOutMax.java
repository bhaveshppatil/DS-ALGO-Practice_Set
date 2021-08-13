import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TakeOutMax {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int size = scan.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        int sum = 0, max = 0;
        for (int i = 0; i < size; i++) {
            sum += arr[i];
        }
        max = Math.max(sum, max);

        for (int i = size; i < arr.length; i++) {
            sum -= arr[i - size];
            sum += arr[i];
            max = Math.max(sum, max);
            arrayList.add(max);
        }
        int maxNum = Collections.max(arrayList);
        System.out.println(maxNum);
    }
}
