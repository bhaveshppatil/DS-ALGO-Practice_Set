import java.util.Scanner;

public class GPRecursion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int r = scan.nextInt();

        System.out.format("%.4f", geometricRecusion(n, r));
    }

    private static double geometricRecusion(int n, int r) {
        double GpSum = 0;

        if (r == 0) {
            return 1;
        } else {
            GpSum = 1 / Math.pow(n, r) + geometricRecusion(n, r-1);
        }
        return GpSum;
    }
}
