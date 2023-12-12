import java.util.Scanner;

public class Found_Recursion_Factorial_02 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int ans = getFactorial(n);
        System.out.println(ans);
    }

    public static int getFactorial(int n) {

        if( n == 1 ) {
            return 1;
        }

        int temp = getFactorial(n - 1);
        return temp * n;
    }
}
