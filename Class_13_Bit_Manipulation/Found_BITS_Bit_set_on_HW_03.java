// Solution video -> https://www.youtube.com/watch?v=KbBxyfAfWLA
// Toggle (set ko unset , unset ko set  use xor)-> int ans = n ^ (1 << k);
import java.util.Scanner;

public class Found_BITS_Bit_set_on_HW_03 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();

        int ans = n | (1 << k); // kth unset bit ko set krna hai , 1 ko kth position per le jau from right
        System.out.println(ans);
    }
}
