import java.util.Scanner;

public class MaxOfArray_02 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        int max = Integer.MIN_VALUE;

        for(int i = 0 ; i < arr.length ; i++) {
            arr[i] = scn.nextInt();
            if(arr[i] > max)
                max = arr[i];
        }

        System.out.println(max);
    }
}
