package Java8features.StreamAPIQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class VVIFrequencyOfEachElement {

    public static void main(String[] args) {

        List<Integer> number = Arrays.asList(1,1,2,3,4,4,4,5,5,6);
        Map<Integer, Long> frequencyMap = number.stream()
                .collect(Collectors.groupingBy(i->i , Collectors.counting()));
        System.out.println("Count of each element = "+frequencyMap);

    }

}
/*
37. Write a program to find the frequency of each element in a list of integers using Java Stream API.


 */