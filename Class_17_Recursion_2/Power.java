import java.util.Scanner;

public class Power {
    public static long pow(int a , int n) {
        if(n == 1) {
            return a;
        }
        long temp = pow(a , n / 2); // if few tc is failing try long instead of int


        if(n % 2 == 0)
            return (temp * temp);
        else
            return (temp * temp * a);
        

    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int n = scn.nextInt();

        System.out.println(pow(a , n));
    }
}
//for negative a^n if n is negative -3 and a is 2 then find ans and do 1/ans as ans for negative