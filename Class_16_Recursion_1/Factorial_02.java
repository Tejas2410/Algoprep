import java.util.Scanner;

public class Factorial_02 {
    public static int fact(int n) {
        if( n == 1) {
            return 1;
        }
        int factnm1 = fact( n - 1 );
        return  factnm1 * n;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();


        System.out.println(fact(n));
    }
}
