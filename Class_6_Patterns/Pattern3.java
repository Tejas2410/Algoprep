import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int nor = scn.nextInt();

        if(nor % 2 == 0) {

            System.out.println("-1");

        } else {

            int nst = 1;
            int nsp = nor/2;
            int count = 1;

            for(int cr = 1 ; cr <= nor ; cr++) {

                for(int csp = 1 ; csp <= nsp ; csp++) {
                    System.out.print("\t");
                }

                int val = count;
                for(int cst = 1 ; cst <= nst ; cst++) {
                    System.out.print(val + "\t");
                    if(cst <= nst/2)
                        val++;
                    else
                        val--;
                }
                if(cr <= nor/2){
                    nst += 2;
                    nsp--;
                    count++;
                } else {
                    nst -= 2;
                    nsp++;
                    count--;
                }

                System.out.println();
            }
        }
    }
}
