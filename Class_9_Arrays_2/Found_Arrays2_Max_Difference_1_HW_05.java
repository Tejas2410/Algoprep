import java.util.Scanner;
import java.lang.*;

public class Found_Arrays2_Max_Difference_1_HW_05 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n ; i++) {
            arr[i] = scn.nextInt();
        }
        int max = Integer.MIN_VALUE;
        //check all the index i < j and j > i
        for(int i = 0; i < n; i++) {
            for(int j = 0 ; j < n ; j++) {
                if(arr[i] != arr[j] && Math.abs(arr[i] - arr[j] + ( j - i )) > max){
                    max = Math.abs(arr[i] - arr[j] + ( j - i ));
                }
            }
        }
        System.out.println(max);
    }
}
