package Java8features.StreamAPIQuestions;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MaximumElement {


    public static void main(String[] args) {

        List<Integer> number = Arrays.asList(1,3,53,72,25,7,23,547,6,5,46,73);
        int max = number.stream()
                .mapToInt(i -> i.intValue())
                .max()
                .orElse(0);
        System.out.println("The max value is = "+max);
        List<Integer> sortedStream = number.stream()
                                        .sorted()
                                        .collect(Collectors.toList());
        System.out.println(sortedStream);

    }

}
