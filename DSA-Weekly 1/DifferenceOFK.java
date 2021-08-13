import java.util.Scanner;

public class DifferenceOFK {
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
            int count = 0;
            int end = arr.length - 1;
            while (end >= 0) {
                int start = 0;
                while (start < arr.length) {
                    if (start != end) {
                        if (arr[end] - arr[start] == k) {
                            count++;
                        }
                    }
                    start++;
                }
                end--;
            }

            if (count >= 1) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
