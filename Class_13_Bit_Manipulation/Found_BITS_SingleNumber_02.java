import java.util.Scanner;

public class Found_BITS_SingleNumber_02 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];

        for(int i = 0 ; i < n ; i++) {
            arr[i] = scn.nextInt();
        }

        int ans = findSingleNumber(arr);
        System.out.println(ans);

    }

    public static int findSingleNumber(int[] arr) {
        int ans = 0;
        for(int i = 0; i < arr.length ; i++) {
            ans = ans ^ arr[i]; // N ^ 0 = N
        }
        return ans;
    }
}

