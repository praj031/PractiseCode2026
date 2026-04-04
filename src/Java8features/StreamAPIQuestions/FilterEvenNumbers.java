package Java8features.StreamAPIQuestions;

import java.util.Arrays;
import java.util.List;

public class FilterEvenNumbers {

    public static void main(String[] args) {

        List<Integer> number = Arrays.asList(1,3,53,72,25,7,23,547,6,5,46,73);

        List<Integer> filteredNumber = number.stream()
                .filter(num -> num%2 == 0)
                .toList();

        System.out.println("List of even numbers : "+filteredNumber);

    }
}
