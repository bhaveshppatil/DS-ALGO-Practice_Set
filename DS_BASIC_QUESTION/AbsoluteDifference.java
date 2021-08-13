import java.util.Scanner;

public class AbsoluteDifference {
    public static void main(String[] args) {
        difference();
    }

    public static void difference() {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int abDiff = a - b;
        if (abDiff < 0) {
            System.out.println(-abDiff);
        } else {
            System.out.println(abDiff);
        }
    }
}
