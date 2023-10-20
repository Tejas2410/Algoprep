import java.util.*;
public class HashMap {
    public static void main(String[] args) {
        Map<Integer,Integer> hm = new java.util.HashMap<>();
        hm.put(10,70);
        hm.put(20,80);
        hm.put(30,90);

        System.out.println(hm.get(20));
        System.out.println(hm.get(30));

        System.out.println(hm.containsKey(10));
        hm.remove(10);
        System.out.println(hm.containsKey(10));

        System.out.println("--------------------------------------------------------");
        hm.put(40,100);
        for(int items : hm.keySet()){
            System.out.println(items); // o/p keys in random order
        }

//         o/p
//        80
//        90
//        true
//        false
//    --------------------------------------------------------
//        20
//        40
//        30

    }
}
