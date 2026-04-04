package Java8features.StreamAPIQuestions;

import java.util.Arrays;
import java.util.List;

public class PrimeNumber {
    public static void main(String[] args) {
        primeNumberCheck();
    }

    static void primeNumberCheck(){
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> prime = numbers.stream()
                .filter(n -> n > 1 &&  isPrime(n))
                .toList();
        System.out.println("List of primes number "+prime);
    }

    static boolean isPrime(int n){
        for (int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

}
