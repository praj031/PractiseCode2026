package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class HashSetPrg {

    public static void main(String[] args) {

        //Convert a hashset to a list

        HashSet<String> hashSet = new HashSet<>();

        hashSet.add("String11");
        hashSet.add("String55");
        hashSet.add("String38");
        hashSet.add("String41");
        hashSet.add("String51");
        hashSet.add("String61");
        hashSet.add("String79");

        List<String> list = new ArrayList<>(hashSet);

        Collections.sort(list);

        System.out.println(list);


    }

}
