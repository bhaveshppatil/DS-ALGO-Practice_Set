import java.util.Scanner;

public class RunningSumArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        for (int t = 0; t < test; t++) {
            int n = scan.nextInt();

            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = scan.nextInt();
            }

            int[] runningArr = new int[n];
            runningArr[0] = arr[0];

            int sumArr = 0;

            for (int i = 0; i < n; i++) {
                if (i == 0) {
                    runningArr[i] = arr[i];
                    System.out.print(runningArr[i] +" ");
                } else {
                    runningArr[i] = runningArr[i - 1] + arr[i];
                    System.out.print(runningArr[i] + " ");
                }
            }
            System.out.println();
        }
    }
}
