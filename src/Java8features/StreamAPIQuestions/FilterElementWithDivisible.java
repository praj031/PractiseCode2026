package Java8features.StreamAPIQuestions;

import java.util.Arrays;
import java.util.List;

public class FilterElementWithDivisible {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 21, 45,150);
        List<Integer> result = numbers.stream()
                .filter(n -> n%3==0 && n%5==0)
                .toList();
        System.out.println("The numbers divisible by 3 & 5 are : "+result);


    }
}
/*
Write a program to filter out all the elements divisible by 3 and 5 from a list of integers using Java Stream API.
 */