import java.util.Scanner;

public class CountPairs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        int count = 0;
        int sum = 0;
        int prime = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                prime = i % j;
                if (prime > 2) {
                    for (int k = 2; k < prime; k++) {
                        if (prime % k == 0) {
                            count++;
                        }
                        if (count == 1) {
                            sum += arr[j] - arr[i];
                        }
                    }
                }
            }
        }
        System.out.println(sum);
    }
}