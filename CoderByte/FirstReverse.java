package CoderByte;

public class FirstReverse {
    public static void main(String[] args) {
        String str = "Bhavesh Patil";
        String reverse = reverseString(str);
        System.out.println(reverse);
    }

    private static String reverseString(String str) {
        String reverseStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverseStr += str.charAt(i);
        }
        return reverseStr;
    }
}
