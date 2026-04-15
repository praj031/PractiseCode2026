package Java8features.StreamAPIQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MaximumNumberOfVowels {

    public static void main(String[] args) {

        List<String> strings = Arrays.asList("apple", "banana", "kiwi", "orange", "pear");
        Map<String, Long> frequencyMap = strings.stream()
                .collect(Collectors.toMap(s -> s, s -> s.chars().filter(c -> "AEIOUaeiou".indexOf(c) != -1).count()));
        long maxVowelCount = frequencyMap.values().stream().mapToLong(Long::longValue).max().orElse(0);
        List<String> maxVowelStrings = frequencyMap.entrySet().stream()
                .filter(entry -> entry.getValue() == maxVowelCount)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        System.out.println("String(s) with maximum number of vowels: " + maxVowelStrings);
    }

}
/*

38. Given a list of strings, write a program to find and print the strings with the maximum number of vowels using Java Stream API.


 */
