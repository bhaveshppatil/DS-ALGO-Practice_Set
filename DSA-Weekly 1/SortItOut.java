import java.util.ArrayList;
import java.util.Scanner;

public class SortItOut {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
            arrayList.add(arr[i]);
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[i]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arrayList.size(); j++) {
                if (arrayList.get(j) == arr[i]) {
                    System.out.print(j + " ");
                }
            }
        }
        System.out.println();
    }
}
