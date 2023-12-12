import java.util.HashMap;
import java.util.Scanner;

public class Found_HashMap_PairSum_04 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.println(findPairSum(arr , k));
    }

//    public static String findPairSum(int[] arr , int k) {
//          // O(n^2)
//        for(int i = 0 ; i < arr.length ; i++) {
//            for(int j = 0 ; j < arr.length ; j++) {
//                if(i == j) {
//                    continue;
//                }
//                if (arr[i] + arr[j] == k) {
//                    return "Yes";
//                }
//            }
//        }
//        return "No";
//    }

    public static boolean findPairSum(int[] arr , int k) {
        HashMap<Integer , Integer> hm = new HashMap<>();

        // Frequency count
        for(int i = 0 ; i < arr.length ; i++) {
            if(hm.containsKey(arr[i]) == true) {
                int temp = hm.get(arr[i]);
                hm.put(arr[i] , temp);
            } else {
                hm.put(arr[i] , 1);
            }
        }

        for(int i = 0 ; i < arr.length ; i++) {
            int a = arr[i];
            int b = k - a; // if b is there in keys of hm than pair is found

            // a != b is given in question if a == b then the occurence should be more than 1
            if(a != b && hm.containsKey(b) == true) {
                return true;
            } else if( a == b && hm.containsKey(b) == true && hm.get(b) > 1 ) {
                return true;
            }
        }
            return false;
    }
}
