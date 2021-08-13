import java.util.Scanner;

public class Intersection {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[] arr = new int[n];
        int[] arr2 = new int[n];


        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        for (int i = 0; i < n; i++) {
            arr2[i] = scan.nextInt();
        }
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr[i] == arr2[j]) {
                    count = arr[i];
                }
            }
        }
        System.out.println(count);
    }
}
