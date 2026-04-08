package Java8features.StreamAPIQuestions;

public class FibonacciSeries {

    public static void main(String[] args) {
        fibonacciSeries();
        System.out.println(" ");
        palindrome();

    }


    static void fibonacciSeries() {

        int n = 10;
        int a = 0;
        int b = 1;
        int sum = 0;
        for (int i = 2; i < n; i++) {

            sum = a + b;
            a = b;
            b = sum;


            System.out.print(sum + " ");
        }
    }

    static void palindrome(){

        int n = 121;
        int store = n;
        int result = 0;
        while(n>0){
            int rem = n%10;
            result = (result*10)+rem;
            n = n/10;
        }
        if(result == store){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not palindrome");
        }

    }

}
