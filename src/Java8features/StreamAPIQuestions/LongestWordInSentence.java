package Java8features.StreamAPIQuestions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LongestWordInSentence {
    public static void main(String[] args) {

        String sentence = "This is a z stream problem";
        String longest = Arrays.stream(sentence.split(" "))
                .max(Comparator.comparingInt(String::length))
                .orElse(" ");
        System.out.println("Longest word = "+longest);

        int maxLength = Arrays.stream(sentence.split(" "))
                .mapToInt(String::length)
                .max()
                .orElse(0);
        List<String> longestString = Arrays.stream(sentence.split(" "))
                .filter(s -> s.length() == maxLength)
                .toList();
        System.out.println("List of longest string = "+longestString);


    }
}
