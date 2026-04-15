package Java8features.StreamAPIQuestions;

import java.util.Arrays;
import java.util.List;

public class RemoveDuplicateElement {

    public static void main(String[] args) {
        usingLambda();
    }
    static void usingLambda(){

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 2, 5, 6, 3, 7, 8, 1);
        List<Integer> sortedList = numbers.stream()
                .distinct().toList();
        System.out.println("Removed duplicates from the array = "+sortedList);
    }
}
