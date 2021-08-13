import java.util.Scanner;

public class OddOrNot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        isOdd(n);

        for (int i=0; i<=n;i++){
            if (i%2==1){
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isOdd(int n) {

        boolean isOdd = false;

            if (n % 2 == 1) {
                isOdd = true;
            }
        System.out.println(isOdd);
        return false;
    }
}
