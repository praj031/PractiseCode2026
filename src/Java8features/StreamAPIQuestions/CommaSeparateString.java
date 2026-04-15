package Java8features.StreamAPIQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CommaSeparateString {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "kiwi", "orange", "pear");
        String commaSeparate = strings.stream()
                .collect(Collectors.joining(" ,"));
        System.out.println(commaSeparate);
    }
}

/*
27. Write a program to convert a list of strings to a comma-separated string using Java Stream API.


 */