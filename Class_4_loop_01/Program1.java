import java.util.*;
public class Program1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int marks = scn.nextInt();

        if(marks >= 35){
            System.out.println("pass");
        } else {
            System.out.println("fail");
        }
    }
}
