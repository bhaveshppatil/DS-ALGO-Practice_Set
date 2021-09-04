import java.util.Scanner;

public class ExcelColumnNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test != 0) {
            String str = scan.nextLine();
            int excelNum = findExcelNum(str, test);
            System.out.println(excelNum);
            test--;
        }
    }

    private static int findExcelNum(String str, int test) {
        int excNum = 0;
        while (test != 0) {
            if (str.length() < 1) {
                return 1;
            } else {
                for (int i = 0; i < str.length(); i++) {
                    excNum = excNum * 26 + str.charAt(i) - 'A' + 1;
                }
            }
            test--;
        }
        return excNum;
    }
}
