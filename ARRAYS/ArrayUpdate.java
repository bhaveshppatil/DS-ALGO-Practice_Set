import java.util.Scanner;

public class ArrayUpdate {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        int count =0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < k) {
                count = arr[i] +1;
            }
        }
        System.out.println(count);
    }
}
