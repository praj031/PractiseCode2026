package Java8features.StreamAPIQuestions;

import java.util.Arrays;
import java.util.List;

public class CheckSortedListAscending {

    public static void main(String[] args) {

        List<Integer>  number = Arrays.asList(1,2,3,4,5);
        boolean check = number.stream()
                            .sorted()
                            .toList()
                            .equals(number);

        System.out.println("Weather the numbers in list is sorted or not ? "+check);


    }
}
