import java.util.Scanner;

public class LongestRepeatedOdd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        int count = 0;
        int previousCount = 0;

        count = previousCount;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1) {
                count++;
            } else {
                break;
            }
        }

        if (count > previousCount){
            System.out.println(count);
        }
    }
}
/*
int count = 1;
        int maxCount = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] % 2 == 1) {
                if (arr[i] == arr[i + 1])
                    count++;
            } else if (count > maxCount) {
                maxCount = count;
                //maxCount = Math.max(maxCount, count);
                count = 1;

            }
        }
        System.out.println(maxCount);
 */