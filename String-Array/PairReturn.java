import java.util.Arrays;
import java.util.Scanner;

public class PairReturn {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();

        for (int t = 0; t < test; t++) {
            int n = scan.nextInt();
            int k = scan.nextInt();

            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scan.nextInt();
            }

            Arrays.sort(arr);

            int count = 0;
            for (int i = 0; i < n; i++) {
                int start = i + 1;
                int end = arr.length - 1;
                while (start < end) {
                    if (arr[i] + arr[start] == k){
                        count++;
                    }
                    start++;
                    end--;
                }
            }

            if (count == 1) {
                System.out.println("1");
            } else {
                System.out.println("-1");
            }
        }
    }
}
/*
 for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] + arr[j] == k) {
                        count++;
                    }
                }
            }
 */