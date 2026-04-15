package JavGenericsAndWrapperClass;

import java.util.ArrayList;

public class StoreIntegerInList {
    static void main(String[] args) {

        ArrayList<Integer> integerArrayList =  new ArrayList<>();
        integerArrayList.add(12);
        integerArrayList.add(13);
        integerArrayList.add(14);
        integerArrayList.add(15);
        integerArrayList.add(16);
        integerArrayList.add(17);

        System.out.println(integerArrayList.size());
        System.out.println(integerArrayList.contains(30));
    }
}
