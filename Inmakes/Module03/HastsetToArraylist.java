// 3. Write a Java Program To Convert A HashSet To An ArrayList

import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;

public class HastsetToArraylist {
    public static void main(String[] args) {
        HashSet<String> hset = new HashSet<>();

        hset.add("Franklin");
        hset.add("Maria");
        hset.add("Nayagam");
        hset.add("Benjamin");
        hset.add("Roosevult");

        System.out.println(hset);

        List<String> arraylist = new ArrayList<>(hset);

        System.out.println(arraylist);

    }
}
