//import java.util.Scanner;
//
//public class NoOfFactor_01 {
//    public static void main(String[] args) {
//        Scanner scn = new Scanner(System.in);
//        int n = scn.nextInt();
//        int fac = 0;
//
//        for(int i = 1 ; i <= n ; i++) {
//            if(n % i == 0) {
//                System.out.println(i);
//                fac++;
//            }
//        }
//        System.out.println("Total fac" + fac); // complexity is O(n)
//    }
//}
//--------------------------------------------------------------------------------------------------------

import java.util.Scanner;

public class NoOfFactor_01 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int fac = 0;

        for(int i = 1 ; i * i <= n ; i++) {
            if(n % i == 0) {
                if(i == n/i)
                    fac += 1;
                else
                    fac += 2;
            }
        }
        System.out.println(fac); // complexity is O(sqrt(n))
    }
}
// 24 -> 8 factors  // 36 -> 9 factor (6 is repeating) -> i == n/i
// 1 * 24           // 1 * 36                             6 == 36/6 -> count = 1
// 2 * 12           // 2 * 18
// 3 * 7            // 3 * 12
// 4 * 6            // 4 * 9
                    // 6 * 6