import java.util.ArrayList;
import java.util.Scanner;

public class largestEvenFreq {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        for (int t = 0; t < test; t++) {
            int n = scan.nextInt();

            int[][] arr = new int[n][n];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    arr[i][j] = scan.nextInt();
                }
            }
            ArrayList<Integer> arrayList = new ArrayList<>();
            int diaDown = 0;
            for (int i = 0; i < n; i++) {
                for (int j = n - 1; j >= 0; j--) {
                    if (i == j) {
                        arrayList.add(arr[i][j]);
                    }
                    if (i < n - 1 && j > 0) {
                        arrayList.add(arr[i][j]);
                        diaDown = arr[i + 1][j - 1];
                        arrayList.add(diaDown);
                    }
                }
            }
            int largest =arr[0][1];
            for (int i = 0; i < arrayList.size(); i++) {
                if (arrayList.get(i) > largest){
                    largest = arrayList.get(i);
                }
            }
            if (largest % 2 ==0){
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
        }
    }
}
