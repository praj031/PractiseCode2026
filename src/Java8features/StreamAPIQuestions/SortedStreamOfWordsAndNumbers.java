package Java8features.StreamAPIQuestions;

import java.util.Arrays;
import java.util.List;

public class SortedStreamOfWordsAndNumbers {

    public static void main(String[] args) {
       sortedNumberStream();
       sortedLettersStream();
    }

    static void sortedLettersStream() {
        List<String> strings = Arrays.asList("banana", "orange", "apple", "grape");
        List<String> sortedStrings = strings.stream()
                .sorted()
                .toList();
        System.out.println("Value of sorted list of string : "+sortedStrings);
    }

    static void sortedNumberStream(){
        List<Integer> number = Arrays.asList(1,3,53,72,25,7,23,547,6,5,46,73);
        List<Integer> sorted = number.stream()
                .sorted()
                //.collect(Collectors.toList());
                .toList();
        System.out.println("Sorted values = "+sorted);
    }

}
