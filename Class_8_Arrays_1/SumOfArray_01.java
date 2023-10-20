import java.util.Scanner;

public class SumOfArray_01 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sum = 0;

        int[] arr = new int[n];

        for(int i = 0 ; i < arr.length ; i++) {
            arr[i] = scn.nextInt();
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
