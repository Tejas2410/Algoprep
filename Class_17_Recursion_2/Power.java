import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();

        int ans = pow(x,n);
        System.out.println(ans);
    }

    public static int pow(int x , int n) {
        if( n == 1) {
            return x;
        }
        int temp = pow(x , n / 2); //if few tc is failing try long instead of int

        if( n % 2 == 0) {
            return temp * temp;
        } else {
            return temp * temp * x;
        }



    }
}

// for negative a^n if n is negative -3 and a is 2 then find ans and do 1/ans as ans for negative i.e. 1/8

// 2^8 -> 2^4 * 2^4
// // 2^9 -> 2^4 * 2^4 * 2
// tc O(logn)



















