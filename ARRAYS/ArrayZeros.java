import java.util.Scanner;

public class ArrayZeros {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        int count = arr[0];
        int count2 = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (i < n-1) {
                count = arr[i] - 1;
                count2 = arr[i + 1] - 1;
            }
        }
        if (count == count2) {
            System.out.println("Yes");

        } else {
            System.out.println("No");
        }
    }
}
