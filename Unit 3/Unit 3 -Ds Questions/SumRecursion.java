import java.util.ArrayList;
import java.util.Scanner;

public class SumRecursion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test != 0) {
            int n = scan.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = scan.nextInt();
            }
            int sum = sumAgain(arr, n, test);
            System.out.println(sum);
            test--;
        }
    }

    private static int sumAgain(int[] arr, int n, int test) {
        int sum = 0;
        int total = 0;

        while (test != 0) {
            if (n == 1) {
                return n;
            } else {
                for (int i = 0; i < n; i++) {
                    for (int j = i + 1; j < n; j++) {
                        sum = arr[j] - arr[i];
                        if (sum < 0){
                            total += (-sum);
                        }
                        total += sum;
                        break;
                    }
                }
            }
            test--;
        }
        return total;
    }
}
