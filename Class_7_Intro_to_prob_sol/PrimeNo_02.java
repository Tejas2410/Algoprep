// Prime no. optimized
import java.util.Scanner;

public class PrimeNo_02 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int fac = 0;

        for(int i = 1 ; i * i <= n ; i++) {
            if(n % i == 0) {
                fac += 2;
            }
        }
        if(fac == 2 && n != 1) {
            System.out.println("Yay");//prime
        } else {
            System.out.println("Nay"); // not prime
        }

    }
}
