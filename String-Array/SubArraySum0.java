import java.util.Scanner;

public class SubArraySum0 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String[] str2 = str.split(" ");
        int len = str2.length;
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = Integer.parseInt(str2[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum == 0) {
                    System.out.println(i + " " + j);
                }
            }
        }
    }
}
