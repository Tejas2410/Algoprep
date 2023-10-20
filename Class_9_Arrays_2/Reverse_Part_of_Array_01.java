import java.util.Scanner;

public class Reverse_Part_of_Array_01 {
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
        int low = scn.nextInt();
        int high = scn.nextInt();

        reverse(arr , low , high);
        for(int i = 0; i < n ; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
