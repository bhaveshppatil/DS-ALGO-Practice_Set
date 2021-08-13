import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        for (int t = 0; t < test; t++) {
            int n = scan.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scan.nextInt();
            }
            int sum = 0;

            for (int i = 0; i < n; i++) {
                while (arr[i] !=0){
                    sum = sum + arr[i]%10;
                    arr[i]/=10;
                }
            }
            System.out.println(sum);
        }
    }
}
