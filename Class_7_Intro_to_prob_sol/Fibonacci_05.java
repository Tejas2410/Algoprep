//Print the nth number of Fibonacci sequence
import java.util.Scanner;

public class Fibonacci_05 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a = 0;
        int b = 1;

        for(int i = 0 ; i < n ; i++) {
            int c = a + b;
            a = b;
            b = c;
        }
        System.out.println(a);

    }
}
