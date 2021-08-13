import java.util.Scanner;

public class SumOfPairs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        int diff = 0;
        int sum = 0;



        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                diff = arr[j] - arr[i];
                for (int k = 2; k <= diff+1; k++) {
                    if (diff % k == 0 && diff !=1) {
                        sum = arr[i] + arr[j];

                    }
                }
            }
        }
        System.out.println(sum);
    }
}
