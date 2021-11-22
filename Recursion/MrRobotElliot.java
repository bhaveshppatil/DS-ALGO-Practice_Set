package Recursion;

/*
 Mr Robot - Elliot Ended
Description

Mr.Robot needs an encryption method, so Elliott was there to help him. At the same time, Richard wrote a paper on encryption. Elliott then started writing his algorithms with the help of paper from Richard but he needs your help in implementing. The algorithm is like this:

Given an input string, the encrypted string will start with the middle character of the string and will be formed henceforth with the middle characters of the left and right substrings (of the middle character of the word) and so on. Take a look at the explanation of the sample test case for better understanding.

Input
Input Format :
The first line contains an integer T denoting the number of TEST CASES. Each TEST CASE consists of 2 lines. The first line contains an integer N denoting the length of the word that needs to be encrypted. The second line contains the word that needs to be encrypted.

Constraints :

1 <= T <= 10
1 <= Length of the string <= 10000

Output
N lines where each line will contain the encrypted words

Sample Input 1

3
3
abc
4
abcd
11
abcdefghijk

Sample Output 1

bac
bacd
fcabdeighjk
*/

import java.util.Scanner;

public class MrRobotElliot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test != 0) {
            int n = scan.nextInt();
            String str = "";
            do {
                str += scan.nextLine();
            } while (str.length() != n);

            String output = findMiddleCharOfStr(str, 0, str.length() - 1);
            System.out.println(output);
            test--;
        }
    }

    private static String findMiddleCharOfStr(String str, int i, int j) {
        String res = "";
        if (i > j) {
            return res;
        }
        int mid = (i + j) / 2;
        res = res + str.charAt(mid) + findMiddleCharOfStr(str, i, mid - 1) + findMiddleCharOfStr(str, mid + 1, j);
        return res;
    }
}
