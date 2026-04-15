package Java8features.StreamAPIQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConcatenateAllTheStringInStream {

    public static void main(String[] args) {
        concatenate();
    }

    static void concatenate(){
        List<String> strings = Arrays.asList("apple", "banana", "orange", "grape");
        String finalString = strings.stream()
                .collect(Collectors.joining());
        System.out.println("Value of concatenated string : "+finalString);
    }

}
