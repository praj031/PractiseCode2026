package Java8features.StreamAPIQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class AverageOfNumbers {

    public static void main(String[] args) {

        List<Integer> number = Arrays.asList(1,3,53,72,25,7,23,547,6,5,46,73);
        double average = number.stream()
                .mapToLong(s -> s)
                .average()
                .orElse(0.0);
        System.out.println("Average of the values : "+average);


    }
}
