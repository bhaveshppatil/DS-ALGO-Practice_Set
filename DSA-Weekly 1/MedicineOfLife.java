import java.util.Scanner;

public class MedicineOfLife {
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
            int count =0;
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (arr[i] + arr[j] == k){
                        count++;
                    }
                }
            }
            if (count >= 1){
                System.out.println("Possible");
            }else {
                System.out.println("Impossible");
            }
        }
    }
}
