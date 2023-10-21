import java.util.Scanner;

public class Dummy {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        boolean flag = true;

        for(int div = 2 ; div * div <= num ; div++) {
            if(num % div == 0) {
                flag = false;
                break;
            }
        }

        if(flag == true) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
    }
}