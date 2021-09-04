import java.util.ArrayList;
import java.util.Scanner;

public class GenerateParenthesis {

    ArrayList<String> arrayList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test != 0) {
            int n = scan.nextInt();

            String ans = "";
            generateParenthesis(ans, 0, 0, n);
            test--;
        }
    }

    private static void generateParenthesis(String ans, int open, int close, int n) {
        if (ans.length() == 2 * n) {
            System.out.println(ans);
        }
        if (open < n) {
            generateParenthesis(ans + "(", open + 1, close, n);

        }
        if (open > close) {
            generateParenthesis(ans + ")", open, close + 1, n);
        }

    }
}
