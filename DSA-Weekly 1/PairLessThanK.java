import java.util.Scanner;

public class PairLessThanK {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();

        for (int t = 0; t < test; t++) {
            int n = scan.nextInt();

            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scan.nextInt();
            }

            int k = scan.nextInt();

            int maxCount = arr[0];
            int max = 0;
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    max = arr[i] + arr[j];
                    if (max < k) {
                        maxCount = max;
                    }
                }
            }
            if (maxCount < k) {
                System.out.println(maxCount);
            }else {
                System.out.println(-1);
            }
        }
    }
}