import java.util.Arrays;
import java.util.Scanner;

public class Rotate_Array_02 {
    public static void reverse(int[] arr , int low , int high) {
        while(low < high) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n ; i++) {
            arr[i] = scn.nextInt();
        }

        int k = scn.nextInt();

        k = k  % n;
        if( k < 0 ) {
            k = k + n;
        }
        reverse(arr , 0 , n - 1);
        reverse(arr , 0 , k - 1);
        reverse(arr , k , n - 1);

        //System.out.println(Arrays.toString(arr));
        for(int i = 0; i < n ; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
