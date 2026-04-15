package Java8features.StreamAPIQuestions;

import java.util.Arrays;
import java.util.List;

public class SumOfAllTheOddNumber {
    public static void main(String[] args) {
        usinglambda();
        withoutUsingLambda();
    }

    static void usinglambda(){
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int sum = numbers.stream()
                .filter(n->n%2!=0)
                .mapToInt(s->s)
                .sum();
        System.out.println("Sum of all odd numbers in list = "+sum);
    }

    static void withoutUsingLambda(){
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        for(int i=0;i< arr.length;i++){
            if(arr[i]%2!=0){
                sum = sum + arr[i];
            }
        }
        System.out.println("Sum of all odd numbers in list = "+sum);
    }

}
/*
24. Given a list of integers, write a program to find and print the sum of all odd numbers using Java Stream API.
 */