import java.util.Scanner;

public class Pattern_1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int nor = scn.nextInt();

        if(nor % 2 == 0) {

            System.out.println("-1");

        } else {

            int nst = 1;
            int nsp = nor/2;

            for(int cr = 1 ; cr <= nor ; cr++) {

                for(int csp = 1 ; csp <= nsp ; csp++) {
                    System.out.print("\t");
                }

                for(int cst = 1 ; cst <= nst ; cst++) {
                    System.out.print("*\t");
                }
                if(cr <= nor/2){
                    nst += 2;
                    nsp--;
                } else {
                    nst -= 2;
                    nsp++;
                }


                System.out.println();
            }
        }

    }
}
