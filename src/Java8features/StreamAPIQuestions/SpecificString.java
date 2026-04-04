package Java8features.StreamAPIQuestions;

import java.util.Arrays;
import java.util.List;

public class SpecificString {

    public static void main(String[] args) {
        usingLambda();
    }

    static void usingLambda(){
        List<String> strings = Arrays.asList("apple", "banana", "kiwi", "orange", "pear");
        String contains = "apples";
        boolean containString = strings.stream()
                .anyMatch(s->s.equalsIgnoreCase(contains));
        System.out.println("Does the list contains the string : "+containString);
    }

}
/*
17. Write a program to check if a list of strings contains a specific string using Java Stream API.
 */
