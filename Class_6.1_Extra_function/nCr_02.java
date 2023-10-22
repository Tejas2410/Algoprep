import java.util.Scanner;
public class nCr_02 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int r = scn.nextInt();

        int nfac = fac(n);
        int rfac = fac(r);
        int nminusrfac = fac(n-r);

        int ans = nfac /(rfac * nminusrfac);
        System.out.println(ans);
    }

    public static int fac(int f){
        int fact = 1;
        for(int i = 1; i <= f ; i++) {
            fact *= i;
        }
        return fact;
    }
}
// nCr = n! / r! * (n - r)!
// nPr = n! / (n - r)!
//kkkkkkkk