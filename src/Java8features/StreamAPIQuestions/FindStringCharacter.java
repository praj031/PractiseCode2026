package Java8features.StreamAPIQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindStringCharacter {

    public static void main(String[] args) {

        List<String> string = Arrays.asList("apple","banana","kiwi","orange");
        char targetChar = 'a';

        List<String> result = string.stream()
                .filter(s -> s.chars().filter(c -> c == targetChar).count() >= 2)
                .toList();

        System.out.println("List of character having the values = "+result);
    }
}
/*
42. Given a list of strings, write a program to find and print the strings containing a specific character at least twice using Java Stream API.


 */
