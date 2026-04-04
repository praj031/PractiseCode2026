package Java8features.StreamAPIQuestions;

import java.util.Arrays;
import java.util.List;

public class StringToUpperCase {

    public static void main(String[] args) {
        convertStringToUpperCase();
    }

    static void convertStringToUpperCase(){

        List<String> strings = Arrays.asList("apple", "banana", "orange", "grape", "rose");
        List<String> toUpperCase = strings.stream()
                .map(s->s.toUpperCase())
                .toList();
        System.out.println("Value of upper case : "+toUpperCase);

    }

}
