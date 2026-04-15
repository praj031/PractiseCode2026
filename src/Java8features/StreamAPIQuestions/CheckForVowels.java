package Java8features.StreamAPIQuestions;

import java.util.*;
import java.util.stream.Collectors;

public class CheckForVowels {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "kiwi", "orange", "pear", "oai");
        List<String> vowelStrings = strings.stream()
                .filter(s -> s.matches("[aeiouAEIOU]+"))
                .collect(Collectors.toList());
        System.out.println("Strings containing only vowels: " + vowelStrings);
    }
}
