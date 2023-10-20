import java.util.Scanner;

public class STring_Palindrome_or_not {

    public static void reverse(char[] ch) {
        int low = 0;
        int high = ch.length - 1;

        while(low <= high){
            char temp = ch[low];
            ch[low] = ch[high];
            ch[high] = temp;
            low++;
            high--;
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        char[] ch = str.toCharArray();

        reverse(ch);
        String rev = str.valueOf(ch);

        if(str.equals(rev)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
