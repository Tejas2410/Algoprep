// 03 Q // count all distinct element (elements which occurs atleast one)
import java.util.HashSet;
import java.util.Scanner;

public class HashMap_Countt_Distinct_Elements {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        for(int i = 0 ; i < n ; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.println(findDistinctElement(arr));
    }

    public static int findDistinctElement(int[] arr) {
        HashSet<Integer> hs = new HashSet<>();
        // keys are always unique
        for(int i = 0 ; i < arr.length ; i++) {
            hs.add(arr[i]);
        }
        return hs.size();
    }
}
