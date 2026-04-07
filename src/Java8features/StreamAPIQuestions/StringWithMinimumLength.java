package Java8features.StreamAPIQuestions;

import java.util.*;

public class StringWithMinimumLength {

    public static void main(String[] args) {

        List<String> strings = Arrays.asList("apple", "banana", "kiwi", "orange", "pear");
        Optional<String> minSizeString = strings.stream()
                .min(Comparator.comparingInt(String::length));
        System.out.println("The minimum size length of the string = "+minSizeString);
        minSizeLength();
    }

    static void minSizeLength() {
        String[] str = {"apple", "banana", "kiwi", "orange", "pear"};
        int maxLength = 0;
        String longest = "";
        for (int i = 0; i < str.length; i++) {
            if (str[i].length() > maxLength) {
                maxLength = str[i].length();
                longest = str[i];
            }
        }
        System.out.println("Longest length string = " + longest);
    }

}
/*
36. Given a list of strings, write a program to find and print the strings with the minimum length using Java Stream API.
 */