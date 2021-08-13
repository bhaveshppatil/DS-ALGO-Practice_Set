import java.util.Scanner;

public class OddsOfOdds {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int test = scan.nextInt();
        for (int t = 0; t < test; t++) {
            int n = scan.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scan.nextInt();
            }
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 == 1) {
                    count++;
                }
            }
            if (count % 2 ==1){
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
        }
    }
}
