package Java8features.StreamAPIQuestions;

import java.util.Arrays;
import java.util.List;

public class RemoveNullValueFromStringList {
    public static void main(String[] args) {

        List<String> strings = Arrays.asList("apple", null, "banana", null, "kiwi", "orange", null, "pear");
        List<String> result = strings.stream()
                .filter(s -> s != null)
                .toList();
        System.out.println("Final list with removed null values "+result);
    }
}
/*
23. Write a program to remove all null values from a list of strings using Java Stream API.
 */