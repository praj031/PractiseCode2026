package Java8features.StreamAPIQuestions;

import java.util.*;

public class FindSubString {

    public static void main(String[] args) {

        List<String> strings = Arrays.asList("apple", "banana", "kiwi", "orange", "pear");
        String substring = "iw";
        List<String> containsSubstring = strings.stream()
                .filter(s->s.contains(substring))
                .toList();
        System.out.println("List of string that contains the substring = "+containsSubstring);

    }

}
/*
34. Given a list of strings, write a program to find and print the strings containing a specific substring using Java Stream API.
 */