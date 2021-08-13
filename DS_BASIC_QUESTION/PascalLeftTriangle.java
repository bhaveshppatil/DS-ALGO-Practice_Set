import java.util.Scanner;

public class PascalLeftTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int rows= scan.nextInt();
        int i, j,k;

        for (i= 1; i<= rows ; i++)
        {
            for (j=i; j <rows ;j++)
            {
                System.out.print("  ");
            }
            for (k=1; k<=i;k++)
            {
                System.out.print("* ");
            }
            System.out.println("");
        }
        for (i=rows; i>=1; i--)
        {
            for(j=i; j<=rows;j++)
            {
                System.out.print("  ");
            }
            for(k=1; k<i ;k++)
            {
                System.out.print("* ");
            }
            System.out.println("");
        }

/*
        int rows = Scan.nextInt();
        for (int i = 1; i <= rows; i++) {
            for (int j = i; j < rows; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        for (int i = rows; i >= 1; i--) {
            for (int j = i; j <= rows; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k < i; k++) {
                System.out.print("* ");
            }
            System.out.println("");

        }

 */
    }
}
