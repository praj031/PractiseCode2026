package Java8features;

import java.util.ArrayList;
import java.util.List;

public class lambda3 {

    public static void main(String[] args) {

        List<Integer> values = new ArrayList<>();
        for(int i=0;i<5;i++){
            values.add(i);
        }
        //Using lambda expression to enhance the input.
        values.forEach(i -> System.out.println(i));


    }
}
