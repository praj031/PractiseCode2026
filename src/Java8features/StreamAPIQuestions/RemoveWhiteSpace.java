package Java8features.StreamAPIQuestions;

import java.util.Arrays;
import java.util.List;

public class RemoveWhiteSpace {

    public static void main(String[] args) {

        List<String> strings = Arrays.asList("apple", "ba nana", "kiwi", "oran ge", "pear");
        List<String> filteredString = strings.stream()
                .map(s->s.replaceAll("\\s",""))
                .toList();
        System.out.println("Filtered string = "+filteredString);


    }
}
/*
33. Write a program to remove all whitespace from a list of strings using Java Stream API.


 */
