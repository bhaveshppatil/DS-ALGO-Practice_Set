package Sprint_Evaluation_4;

import java.util.Scanner;

public class ArrayEquation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        int a = 2;
        int b = 3;

        int oddSum = 0;
        int evenSum = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                evenSum += arr[i];
            } else {
                oddSum += arr[i];
            }
        }
        int equation = a * evenSum + b * oddSum;
        System.out.println(equation);
    }
}
