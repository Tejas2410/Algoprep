import java.util.Scanner;

public class Print_Increasing_04 {
    public static void printinc(int n) {
//        if(n == 0){
//            return;
//        }

        if(n == 1){
            System.out.println(n);
            return;
        }
        printinc(n - 1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        // return type as void to print many values ex. 1 2 3 4 5
        printinc(n);
    }
}
