package Java8features.StreamAPIQuestions;

import java.util.*;

public class PrintIndex {
    public static void main(String[] args) {
        usingLambda();
        notUsingLambda();
    }

    static void usingLambda(){
        List<Integer> numbers = Arrays.asList(1, 3, 5, 7, 9, 2, 4, 6, 8, 10);
        int find = 4;
        int findNumber = numbers.indexOf(find);
        System.out.println("Index of "+find+" number = "+findNumber);
    }

    static void notUsingLambda(){

        int[] arr = {1, 3, 5, 7, 9, 2, 4, 6, 8, 10};
        int target = 4;
        for (int i=0;i<arr.length;i++){
            if(arr[i] == target){
                System.out.println("Index of "+target+" number = "+i);
            }
        }
    }
}
/*
28. Given a list of integers, write a program to find and print the index of the first occurrence of a specific number using Java Stream API.


 */