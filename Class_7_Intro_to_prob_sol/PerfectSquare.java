//Given a positive integer num, return true if num is a perfect square or false otherwise.
import java.util.Scanner;

public class PerfectSquare {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int i = 1;
        boolean flag = false;
        while(i * i <= n) {
            if (i * i == n) {
                flag = true;
            }
            i++;
        }
        System.out.println(flag);
    }
}
