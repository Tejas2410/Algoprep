// print 0 if queries key is not present in arr
import java.util.HashMap;
import java.util.Scanner;

public class Found_HashMap_FrequencyQueries_01 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();

        int[] arr = new int[n];
        int[] queries = new int[m];

        for(int i = 0 ; i < n ; i++) {
            arr[i] = scn.nextInt();
        }
        for(int i = 0 ; i < m ; i++) {
            queries[i] = scn.nextInt();
        }

        findQueries(arr, queries);
    }

//    public static void findQueries(int[] arr , int[] queries) {
//
//        for(int j = 0 ; j < queries.length ; j++) {
//            int val = queries[j];
//            int count = 0;
//            for(int i = 0 ; i < arr.length ; i++) {
//                if(arr[i] == val) {
//                    count++;
//                }
//            }
//            System.out.println(count);
//        }
//    }

    public static void findQueries(int[] arr , int[] queries) {
        HashMap<Integer , Integer> hm = new HashMap<>();

        for(int i = 0 ; i < arr.length ; i++) {
            if(hm.containsKey(arr[i]) == true) {
                int temp = hm.get(arr[i]);
                hm.put(arr[i] , temp + 1);
            } else {
                hm.put(arr[i] , 1);
            }
        }

        for(int j = 0 ; j < queries.length ; j++) {

            if(hm.containsKey(queries[j]) == true){
                System.out.println(hm.get(queries[j]));
            } else {
                System.out.println(0);
            }
        }

    }
}
