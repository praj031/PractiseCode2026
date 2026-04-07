package Java8features.StreamAPIQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class MixAndMaxOFTwoList {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10, 5, 7, 18, 3, 15);

        OptionalInt min = list.stream().mapToInt(Integer::intValue).min();
        OptionalInt max = list.stream().mapToInt(Integer::intValue).max();

        int difference = max.getAsInt() - min.getAsInt();

        System.out.println("Difference between the min and max = "+difference);



    }

}
