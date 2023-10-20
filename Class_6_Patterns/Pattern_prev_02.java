import java.util.Scanner;
public class Pattern_prev_02 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int nor = scn.nextInt();
        int nst = 1;
        int count = 1;

        for(int cr = 1; cr <=  nor; cr++){
            for (int cst = 1; cst <= nst ;cst++) {
                System.out.print(count+"\t");
                count++;
            }
            nst++;
            System.out.println();
        }
    }
}
