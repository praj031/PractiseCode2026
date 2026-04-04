package Java8features.StreamAPIQuestions;

import java.util.*;
import java.util.stream.Collectors;

public class SpecificPrefix {

    public static void main(String[] args) {
        usingStream();
    }

    static void usingStream(){
        List<String> strings = Arrays.asList("apple", "banana", "kiwi", "orange", "pear", "annar", "aam");
        String prefix = "a";
        List<String> value = strings.stream()
                      .filter(s -> s.startsWith(prefix))
                      .collect(Collectors.toList());
        System.out.println("List of strings having prefix as 'a' = "+value);
    }

}
/*
Given a list of strings, write a program to find and print the strings starting with a specific prefix ‘a’ using Java Stream API.
 */
