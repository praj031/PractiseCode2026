package Java8features.StreamAPIQuestions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MaximumLengthString {
    public static void main(String[] args) {

        List<String> strings = Arrays.asList("apple", "banana", "kiwi", "orange", "pear");
        Optional<String> filteredString = strings.stream()
                .max(Comparator.comparing(s->s.length()));
        System.out.println("The maximum length string = "+filteredString);
        maxString();
    }

    static void maxString(){

        String[] str = {"apple", "banana", "kiwi", "orange", "pear"};
        int defaultLength = 0;
        String result = "";
        for(int i=0;i< str.length;i++){

            if(str[i].length() > defaultLength){
                defaultLength = str[i].length();
                result = str[i];
            }
        }
        System.out.println("The maximum length string = "+result);
    }

}
/*
Given a list of strings, write a program to find and print the strings with the maximum length using Java Stream API.
 */