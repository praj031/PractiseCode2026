package Java8features.StreamAPIQuestions;

import java.util.*;

public class ShortestString {

    public static void main(String[] args) {
       usingLambda();
    }
    static void usingLambda(){

        List<String> strings = Arrays.asList("apple", "banana", "kiwi", "orange", "pear", "pic");
        String smallestString = strings.stream()
                .min(Comparator.comparingInt(s-> s.length()))   //This will compare the string by extracting the size of it.
                .orElse(null);
        System.out.println("Smallest String : "+smallestString);
    }


}
