package Java8features.StreamAPIQuestions;

import java.util.Arrays;
import java.util.List;

public class MaxSalary {
    public static void main(String[] args) {
        List<Integer> salary = Arrays.asList(12000, 24000, 4000, 75000, 12000);
        List<Integer> maxSal = salary.stream()
                .filter(s -> s > 5000)
                .toList();
        System.out.println(maxSal);
    }
}
