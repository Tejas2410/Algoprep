import java.util.Scanner;

public class Palindrome_02 {

    public static boolean isPalindrome(char[] ch , int si , int ei) {
        // si > ei for even String like MALAALAM
        if(si == ei || si > ei) {
            return true;
        }

        if(ch[si] == ch[ei]) {
            boolean temp = isPalindrome(ch , si + 1 , ei - 1); // in temp we'll get true or false
            return temp;
        } else {
            return false;
        }

    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();

        char[] ch = str.toCharArray();
        int si = 0;
        int ei = ch.length - 1;

        System.out.println(isPalindrome(ch , 0 , ch.length - 1));

    }
}
