//String -> char array -> string
//    str.toCharArray() -> str.valueOf(ch)
import java.util.Scanner;

public class String_Reverse_02 {

    public static String reverse(String str) {
        char[] ch = str.toCharArray();

        int low = 0;
        int high = ch.length - 1;

        while(low < high) {
            char temp = ch[low];
            ch[low] = ch[high];
            ch[high] = temp;
            low++;
            high--;
        }
       String ans = str.valueOf(ch);
        return ans;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        System.out.println(reverse(str));
    }
}
