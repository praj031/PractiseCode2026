package Java8features.StreamAPIQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class LongestString {

    public static void main(String[] args) {
        usingStream();
        withoutStream();
    }

    static void usingStream(){
        List<String> str = Arrays.asList("apple", "banana", "orange", "grape");
        Optional<String> longestString = str.stream()
                .max((str1,str2) -> str1.length() - str2.length());
        System.out.println((longestString.isPresent() ? longestString.get() : "N/A"));  //Ternary operation to find the longest string if it is present or not.

    }
    static void withoutStream(){

        String[] str = {"apple", "banana", "orange", "grape"};
        String longest = "";
        for(int i = 0; i < str.length; i++){
            if(str[i].length() > longest.length()){
                longest = str[i];
            }
        }
        System.out.println(longest);
    }

}
