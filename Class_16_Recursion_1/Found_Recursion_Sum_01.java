import java.util.Scanner;

public class Found_Recursion_Sum_01 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int ans = getSum(n);
        System.out.println(ans);
    }

    public static int getSum(int n) {
        if(n == 1) {
            return 1;
        }
        int temp = getSum(n - 1);

        return temp + n;
    }
}
