//import java.util.Scanner;
//import java.lang.Math;
//
//
////You need to find the square root of a given number N. If N is not a perfect square,
//// then floor(√x) must be returned
//public class FloorNo {
//    public static void main(String[] args) {
//        Scanner scn = new Scanner(System.in);
//        double n = scn.nextInt();
//        n = Math.sqrt(n);
//        Math.floor(n);
//        int x = (int) n;
//        System.out.println(x);
//
//    }
//}


import java.util.Scanner;
        import java.lang.Math;


//You need to find the square root of a given number N. If N is not a perfect square,
// then floor(√x) must be returned
public class FloorNo {
    public static int sqrt(double n) {
        int i = 1;
        int ans = 0;
        while( i * i <= n ) {
            ans = i;
            i++;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double n = scn.nextInt();
        n = Math.floor(sqrt(n));
        int x = (int) n;
        System.out.println(x);

    }
}
