import java.util.Scanner;

public class ArrayAverage {
    public static void main(String[] args) {
        arrayOfAverage();

    }

    public static int arrayOfAverage() {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        int average = sum / n;

        System.out.println(average);

        return 0;
    }
}
