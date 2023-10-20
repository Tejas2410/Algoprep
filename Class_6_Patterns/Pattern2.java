import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int nor = scn.nextInt();

        if(nor % 2 == 0) {

            System.out.println("-1");

        } else {

            int nst = nor/2+1;
            int nsp = 1;

            for(int cr = 1 ; cr <= nor ; cr++) {

                for(int cst = 1 ; cst <= nst ; cst++) {
                    System.out.print("*");
                }

                for(int csp = 1 ; csp <= nsp ; csp++) {
                    System.out.print(" ");
                }

                for(int cst = 1 ; cst <= nst ; cst++) {
                    System.out.print("*");
                }
                if(cr <= nor/2){
                    nst--;
                    nsp += 2;
                } else {
                    nst++;
                    nsp-=2;
                }


                System.out.println();
            }
        }

    }
}
