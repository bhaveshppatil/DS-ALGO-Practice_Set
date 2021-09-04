import java.util.Scanner;

public class SuchPairReturns {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test != 0) {
            int n = scan.nextInt();
            int k = scan.nextInt();

            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = scan.nextInt();
            }
            int count = 0;

            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (arr[i] + arr[j] == k) {
                        count++;
                        break;
                    }
                }
            }

            if (count == 1) {
                System.out.println("1");
            } else {
                System.out.println("-1");
            }

            test--;
        }
    }
}
