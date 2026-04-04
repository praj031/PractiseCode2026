package Java8features.StreamAPIQuestions;

import java.util.*;

public class ProductOfElement {

    public static void main(String[] args) {
        usinglambda();
    }
    static void usinglambda(){

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int result = numbers.stream()
                .reduce(1,(a,b) -> a*b);
        System.out.println("Product of each numbers = "+result);

    }

}
