import java.util.Scanner;

public class TwoSortedArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        for (int t = 0; t < test; t++) {
            int n = scan.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = scan.nextInt();

            }
            int[] arr2 = new int[n];
            for (int i = 0; i < n; i++) {
                arr2[i] = scan.nextInt();
            }

            int left = 0;
            int right = arr.length - 1;
            int count = 0;

            while (left < arr.length && right >= 0) {
                if (arr[left] < arr2[right]) left++;
                else if (arr[left] > arr2[right]) right--;
                else {
                    count++;
                    left++;
                    right--;
                }
            }
            System.out.println(count);
        }
    }
}



/*
  HashSet<Integer> hashSet = new HashSet<>();

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (arr[i] == arr2[j]){
                        hashSet.add(arr[i]);
                    }
                }
            }
            System.out.println(hashSet.size());
 */