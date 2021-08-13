import java.util.Scanner;

public class NextSmallerNextGreater {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        for (int t = 0; t < test; t++) {
            int n = scan.nextInt();

            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scan.nextInt();
            }
            int max = 0;
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (j < n - 1) {
                        if (arr[i] > arr[j]) {
                            if (arr[j] < arr[j + 2]) {
                                max = arr[j+2];
                                System.out.print(max + " ");
                                break;
                            } else {
                                System.out.print(-1);
                            }
                            break;
                        }
                    }
                }
            }
            System.out.println();
        }
    }
}
