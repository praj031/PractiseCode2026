package Java8features.StreamAPIQuestions;

import java.util.*;

public class Squares {

    public static void main(String[] args) {
        squareOfEachNumber();
        cubeOfEachNumber();
        primeNumber();
    }

    static void squareOfEachNumber(){

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> square = numbers.stream()
                .map(n -> (n*n))
                .toList();
        System.out.println("The square of the number = "+square);
    }

    static void cubeOfEachNumber(){
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> square = numbers.stream()
                .map(n -> (n*n*n))
                .toList();
        System.out.println("The square of the number = "+square);
    }

    static void primeNumber(){
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> square = numbers.stream()
                .filter(n -> isPrime(n))
                .toList();
        System.out.println("The square of the number = "+square);
    }

    static boolean isPrime(int n){
            for (int i=2;i<Math.sqrt(n);i++){
               if(n%i==0){
                   return false;
               }
            }
            return true;
    }

}
