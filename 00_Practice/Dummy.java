import java.util.Scanner;

public class Dummy {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        long n = scn.nextLong();
        int fac = 0;

        for(long i = 1 ; i <= n ; i++) {
            if(n % i == 0) {
                fac++;
            }
        }
        System.out.println("Total fac " + fac); // complexity is O(n)
    }
}