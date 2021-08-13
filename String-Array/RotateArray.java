import java.util.Scanner;

public class RotateArray {
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

//            for (int i = 0; i < n; i++) {
//                while (k != 0) {
//                    int temp = arr[i];
//                    arr[i] = arr[n-1];
//                    arr[n-1] = temp;
//                    k--;
//                }
//            }
            for (int i = 0; i < n; i++) {
                if (i < k) {
                    System.out.print(arr[n + i - k] + " ");
                } else {
                        System.out.print(arr[i - k] + " ");
                    }
                }
            System.out.println();
        }
    }
}
