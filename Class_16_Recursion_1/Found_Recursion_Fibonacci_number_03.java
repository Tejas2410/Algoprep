import java.util.Scanner;

public class Found_Recursion_Fibonacci_number_03 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int ans = getFibo(n);
        System.out.println(ans);
    }

    public static int getFibo(int n) {
        if( n == 0 || n == 1) {
            return n;
        }

        int temp1 = getFibo(n - 1);
        int temp2 = getFibo(n - 2);
        return temp1 + temp2;
    }
}
