import java.util.Scanner;

public class MakeArrayEven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int t = scan.nextInt();
        for (int test = 0; test < t; test++) {
            int n = scan.nextInt();

            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = scan.nextInt();
            }

            int count1 = 0;

            for (int k = 0; k < arr.length; k++) {
                count1 += arr[k];
            }
            if (count1 % 2 == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}

