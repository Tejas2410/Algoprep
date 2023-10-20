import java.util.Scanner;

public class FindFloorOfK_02 {
    public static int findFloor(int[] arr , int  k) {
        int lo = 0;
        int hi = arr.length - 1;
        int ans = Integer.MIN_VALUE;

        while(lo <= hi) {

            int mid = ( lo + hi )/ 2;

            if( arr[mid] == k) {
                return k;
            } else if(arr[mid] < k) {
                ans = arr[mid];
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];

        for(int i = 0 ; i < n ; i++) {
            arr[i] = scn.nextInt();
        }
         int k = scn.nextInt();

        System.out.println(findFloor(arr , k));
    }
}
