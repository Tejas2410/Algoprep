import java.util.*;

public class Program4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        if(n % 2 == 0 && n % 3 == 0){
            System.out.println("divisible");
        } else {
            System.out.println("not divisible");
        }
    }
}
