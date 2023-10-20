//Given n length array "arr" and an integer k, Check if there exists a pair(i,j)
// such that arr[i]+arr[j] == k and i!=j
import java.util.Scanner;

public class Two_sum_brute_04 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n ; i++) {
            arr[i] = scn.nextInt();
        }
        int k = scn.nextInt();
        boolean flag = false;
        for(int i = 0; i < n - 1; i++) {
            for(int j = i + 1 ; j < n ; j++) {
                if(arr[i] + arr[j] == k){
                    flag = true;
                }
            }
        }
        System.out.println(flag);

    }
}
