// string - char array -> print char array
import java.util.Scanner;

public class Toggle_Character_Array_01 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String st = scn.nextLine(); // i/p Tejas
        char[] ch = new char[st.length()];

        for(int i = 0; i < ch.length ; i++) {
            ch[i] = st.charAt(i);
            if(ch[i] >=65 && ch[i] <= 90){
                ch[i] = (char)(ch[i]+32);
            } else {
                ch[i] = (char)(ch[i] - 32);
            }
            System.out.print(ch[i]);
        }
    }
}
