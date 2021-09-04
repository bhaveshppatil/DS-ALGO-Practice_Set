import java.util.Scanner;

public class RecursiveBubbleSort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        int[] sorted = bubbleSort(arr, n);
        for (int i=0; i<sorted.length; i++){
            System.out.print(sorted[i] + " ");
        }
        System.out.println();
    }

    private static int[] bubbleSort(int[] arr, int n) {
        if (n == 1) {
            return arr;
        } else {
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (arr[i] > arr[j]){
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }
        return arr;
    }
}
