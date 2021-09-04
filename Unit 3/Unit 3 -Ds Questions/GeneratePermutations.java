import java.util.Scanner;

public class GeneratePermutations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] arr = new int[n];
        String str = "";

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
            str += String.valueOf(arr[i]);
        }

        permute(str, 0, n - 1);

    }

    private static void permute(String str, int l, int r) {
        if (l == str.length()) {
            printPossibility(str);
        } else {
            for (int i = l; i < str.length(); i++) {
                str = swap(str, i, l);
                permute(str, l + 1, r);
                swap(str, l, i);
            }
        }
    }

    private static void printPossibility(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }

    private static String swap(String str, int i, int l) {
        char ch;
        char[] chArr = str.toCharArray();
        ch = chArr[i];
        chArr[i] = chArr[l];
        chArr[l] = ch;
        return String.valueOf(chArr);

    }
}


