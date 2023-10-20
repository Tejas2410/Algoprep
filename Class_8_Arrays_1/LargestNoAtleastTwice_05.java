import java.util.Scanner;

public class LargestNoAtleastTwice_05 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        int max = Integer.MIN_VALUE;
        int maxIdx = 0;

        for(int i = 0 ; i < arr.length ; i++) {
            arr[i] = scn.nextInt();
            if(arr[i] > max) {
                maxIdx = i;
                max = arr[i];
            }
        }


        boolean flag = false;
        for(int i = 0 ; i < arr.length ; i++) {
            if(i == maxIdx) {
                continue;
            }
            else if(arr[i] <= max/2) {
                flag = true;
            } else if(arr[i] > max/2){
                flag = false;
            }
        }

        if (flag == true) {
            System.out.println(maxIdx);
        } else {
            System.out.println("-1");
        }
        }
}
