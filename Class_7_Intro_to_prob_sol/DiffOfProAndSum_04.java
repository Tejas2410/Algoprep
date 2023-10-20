//difference between the product of its digits and the sum of its digits

import java.util.Scanner;

public class DiffOfProAndSum_04 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sum  = 0;
        int pro = 1;

        while(n != 0) {
            int rem = n % 10;
            sum += rem;
            pro *= rem;
            n /= 10;
        }
        System.out.println(pro - sum);
    }
}

