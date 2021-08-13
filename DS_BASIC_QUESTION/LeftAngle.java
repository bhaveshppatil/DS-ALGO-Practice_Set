import java.util.Scanner;

public class LeftAngle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
/*
        for (int i = 1; i<=n; i++){
            for (int j = 1; j<=n-i+1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

 */
        for (int i = 1; i <=n; i++) {


            for (int j = 0; j < 2*(n-i); j++) {
                System.out.print(" ");

            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
