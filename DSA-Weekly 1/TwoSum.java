import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        for (int t = 0; t < test; t++) {
            int n = scan.nextInt();
            int target = scan.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = scan.nextInt();
            }
            int[] index = indices(arr, target, test);
            if (index.length == 2) {
                System.out.println(index[0] + " " + index[1]);
            } else {
                System.out.println("-1 -1");
            }
        }
    }

    private static int[] indices(int[] arr, int target, int test) {
        while (test != 0) {
            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] + arr[j] == target) {
                        return new int[]{i, j};
                    }
                }
            }
            test--;
        }
        return new int[]{};
    }
}
