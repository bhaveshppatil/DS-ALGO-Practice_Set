import java.util.Arrays;
import java.util.Scanner;

public class TwiceExcept {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test != 0) {

            int n = scan.nextInt();
            int arrLen = 2 * n - 1;
            int[] arr = new int[arrLen];
            for (int i = 0; i < arrLen; i++) {
                arr[i] = scan.nextInt();
            }
            Arrays.sort(arr);
            int num = 0;
            for (int i = 0; i < arrLen; i++) {
                for (int j = i + 1; j < arrLen; j++) {
                    if (arr[j] != arr[i]) {
                        num = arr[j];
                    }
                    break;
                }
            }
            System.out.println(num);
            test--;
        }
    }
}
