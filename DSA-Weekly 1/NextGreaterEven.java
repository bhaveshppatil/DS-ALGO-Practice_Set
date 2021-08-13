import java.util.ArrayList;
import java.util.Scanner;

public class NextGreaterEven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test != 0) {
            int n = scan.nextInt();
            ArrayList<Integer> arrayList = new ArrayList<>();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scan.nextInt();
            }

            int greater = 0;
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (arr[j] > arr[i]) {
                        arrayList.add(arr[j]);
                        break;
                    } else if (arr[j] < arr[i]) {
                        arrayList.add(-1);
                        break;
                    }
                }
            }
            int max = 0;
            for (int i = 0; i < arrayList.size(); i++) {
                if (arrayList.get(i) % 2 == 1) {
                    if (arrayList.get(i) > max) {
                        max = arrayList.get(i);
                    }
                }
            }
            System.out.println(max);

            test--;
        }
    }
}
