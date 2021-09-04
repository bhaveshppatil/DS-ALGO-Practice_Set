import java.util.Scanner;

public class TheFamousSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[] arr = new int[n];
        int empty = 0;

        int k = 1;
        for (int i = 0; i < n; i++) {
            arr[i] = k++;
        }
        countAllSubset(arr, n, empty);

    }

    private static void countAllSubset(int[] arr, int n, int empty) {

        if (n == 0) {
            return;
        } else {
            for (int i = 0; i < n; i++) {
                empty += arr[i];
                countAllSubset(arr,i,empty);
            }

        }
    }
}
