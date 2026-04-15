package Java8features.StreamAPIQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class MedianOfInteger {

    public static void main(String[] args) {

        List<Integer> number = Arrays.asList(1,2,3,4,5);
        OptionalDouble result = number.stream()
                .mapToInt(Integer::intValue)
                .sorted()
                .skip((number.size()-1)/2)
                .limit(number.size() % 2 == 0 ? 2: 1)
                .average();

        System.out.println(result);
    }

}
