import java.util.Scanner;

public class Array_Reverse_04 {

    public static void reverse(int[] arr) {
        int low = 0; int high = arr.length - 1;
        while(low<=high) {
            int temp;

            temp = arr[low];
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

        for(int i = 0 ; i < arr.length ; i++) {
            arr[i] = scn.nextInt();
        }

        reverse(arr);


        // System.out.println(Arrays.toString(arr));
        for(int i = 0 ; i < arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
