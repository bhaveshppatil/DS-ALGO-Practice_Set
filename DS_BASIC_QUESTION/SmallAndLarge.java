import java.util.Scanner;

public class SmallAndLarge {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        int small = arr[0];
        int large = arr[0];

        for (int j : arr) {
            if (j < small) {
                small = j;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > large) {
                large = arr[i];
            }
        }
        System.out.println(small);
        System.out.println(large);
    }
}
