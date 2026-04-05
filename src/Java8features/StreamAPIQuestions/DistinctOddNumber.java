package Java8features.StreamAPIQuestions;

import java.util.Arrays;
import java.util.List;

public class DistinctOddNumber {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> result = numbers.stream()
                .distinct()
                .filter(n->n%2!=0)
                .toList();
        System.out.println("List of distinct odd number = "+result);

    }
}
/*
22. Given a list of integers, write a program to find and print the distinct odd numbers using Java Stream API.


 */