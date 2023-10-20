import java.util.Arrays;
import java.util.Scanner;

public class Good_Integer_02 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        Arrays.sort(arr);
        int count = 0;
        for (int i = 0; i < n; i++) {
            if(arr[i] == i) {
                count++;
            }
        }
        System.out.println(count);
    }
}
