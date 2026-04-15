package Java8features.StreamAPIQuestions;

import java.util.Arrays;
import java.util.List;

public class SumOfAllElements {

    public static void main(String[] args) {

        List<Integer> number = Arrays.asList(1,3,4,5,6,7,32,5,3);   //This is the given array as a list
        int sum = number.stream()   //Taking the list as a stream
                .mapToInt(i -> i.intValue())   //Converting it from wrapper to primitive datatype
                .sum();       //predefined function to do the sum of the list
        System.out.println("Sum of number in the array list = "+sum);
    }
}
/*

I converted the list into a stream,
transformed wrapper Integer into primitive int using mapToInt,
and then used the terminal operation sum() to calculate the total.”

 */