package Java8features.StreamAPIQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class KthElementInList {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(3, 1, 4, 1, 5, 9, 2, 6, 5);
        int k = 3;
        Optional<Integer> kthsmallestNumber = number.stream()
                .sorted()
                .distinct()
                .skip(k-1)
                .findFirst();
        System.out.println("K th smallest number = "+kthsmallestNumber.get());


    }
}
