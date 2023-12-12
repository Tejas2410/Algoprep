import java.util.Scanner;

public class Found_BITS_IsEven_01java {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        String ans = isEven(n);
        System.out.println(ans);
    }

    public static String isEven(int n) {
        if((n & 1) == 0){
            return "even";
        } else {
            return "odd";
        }
    }
}

