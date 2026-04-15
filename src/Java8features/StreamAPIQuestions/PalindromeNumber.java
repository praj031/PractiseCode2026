package Java8features.StreamAPIQuestions;

import java.util.Arrays;
import java.util.List;

public class PalindromeNumber {

    public static void main(String[] args) {

        List<String> strings = Arrays.asList("apple", "banana", "kiwi", "banana", "apple");
        boolean check = strings.stream()
                .skip(strings.size() / 2)
                .allMatch(s -> s.equals(strings.get(strings.size() - 1 - strings.indexOf(s))));
        System.out.println("Weather the list is palindrome or not : "+check);


    }

}
/*
List of string is palindrome or not
 */