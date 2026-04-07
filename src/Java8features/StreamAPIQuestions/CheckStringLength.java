package Java8features.StreamAPIQuestions;

import java.util.*;

public class CheckStringLength {

    public static void main(String[] args) {

        List<String> strings = Arrays.asList("apple", "banana", "kiwi", "orange", "pear");
        boolean sameLength = strings.stream()
                .map(String::length)
                .distinct()
                .count()==1;
        System.out.println(sameLength);

    }
}
/*
31. Write a program to check if all elements in a list of strings are of the same length using Java Stream API.


 */