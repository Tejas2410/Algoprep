import java.util.Arrays;
import java.util.Scanner;

public class ArraySwapIndex_03 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];

        for(int i = 0 ; i < arr.length ; i++) {
            arr[i] = scn.nextInt();
        }
        int  a = scn.nextInt();
        int b = scn.nextInt();

        int temp;

        temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;

           // System.out.println(Arrays.toString(arr));
        for(int i = 0 ; i < arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
