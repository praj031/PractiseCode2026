package Java8features.StreamAPIQuestions;

import java.util.Arrays;
import java.util.List;

public class StringWithSpecificLength {

    public static void main(String[] args) {
        StringWithSpecificLengthMethod();
    }

    static void StringWithSpecificLengthMethod(){
        List<String> strings = Arrays.asList("apple", "banana", "kiwi", "orange", "pear");
        int minlength = 5;
        List<String> extractedList = strings.stream()
                        .filter(s -> s.length() > minlength)  //this will give us only string which is more than the str length
                        .distinct()
                        .toList();

        System.out.println("List of string with more then 5 characters : "+extractedList);


    }

}
