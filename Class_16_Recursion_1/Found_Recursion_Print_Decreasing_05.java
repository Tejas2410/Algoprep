import java.util.Scanner;

public class Found_Recursion_Print_Decreasing_05 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        printDecreasing(n);
    }

    public static void printDecreasing(int n) {
        if( n == 1 ) {
            System.out.println(1);
            return;
        }
        System.out.println(n);
        printDecreasing(n - 1);
    }
}
