//inserts between each pair of characters the difference between their ascii codes
// to append at the end of string use '+' operator

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();

        char[] ch = s.toCharArray();
        String ans = "";

        for(int i = 0; i < s.length(); i++) {
            ans = ans + ch[i];
            if(i < s.length() - 1)
                ans = ans + (ch[i+1] - ch[i]);
        }
        System.out.println(ans);
    }
}