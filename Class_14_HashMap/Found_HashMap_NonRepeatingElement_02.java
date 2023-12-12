import java.util.HashMap;
import java.util.Scanner;

public class Found_HashMap_NonRepeatingElement_02 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        for(int i = 0 ; i < n ; i++) {
            arr[i] = scn.nextInt();
        }

        System.out.println(findNonRepeatingEle(arr));
    }

    public static int findNonRepeatingEle(int[] arr) {
        HashMap<Integer , Integer> hm = new HashMap<>();

        for(int i = 0 ; i < arr.length ; i++) {
            if(hm.containsKey(arr[i]) == true) {
                int temp = hm.get(arr[i]);
                hm.put(arr[i] , temp + 1);
            } else {
                hm.put(arr[i] , 1);
            }
        }
        // if i try to iterate on hashmap using hm.keySet() then the order of keys will be random.

        for(int i = 0 ; i < arr.length ; i++) {
            if(hm.get(arr[i]) == 1) {
                return arr[i];
            }
        }
        return 0;
    }
}
