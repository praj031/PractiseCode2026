package InterviewPractice.March;

public class Phase1SheetAll {

    static void main(String[] args) {
        printNumber1(); //To print number from 1-10
        System.out.println(" ");
        printNumber2(); //To print number from 10-1
        System.out.println(" ");
        printEvenNumber();
        System.out.println(" ");
        printOddNumber();
        System.out.println(" ");
        printTableNumber(9);
        System.out.println(" ");
        sumOfN_NaturalNumber(10);
        System.out.println();
        sumOfNEvenNumber(10);
        System.out.println();
        sumOfNOddNumber(10);
        System.out.println(" ");
        factorial(4);
        System.out.println(" ");
        productOfAllDigit(732);
        System.out.println(" ");
        countNumberOfDigit(23432432);
        System.out.println(" ");
        reverseTheNumber(123);
        System.out.println(" ");
        palindromeNumber(123);
        System.out.println(" ");
        sumOfDigitsOfNumber(123);
        System.out.println(" ");
        armstrongNumber(153);
        System.out.println(" ");
        perfectNumber(9);
        System.out.println(" ");
        checkPrimeNumberInRange();
        System.out.println(" ");
        primeNumber(7);
        System.out.println(" ");
        fibonacciSeries(14);
        System.out.println(" ");
        fibonacciSeriesSum(14);
        System.out.println(" ");
        squareOfNumber(5);
        System.out.println(" ");
        cubeOfNumber(5);
        System.out.println(" ");
        printAllNumberInRange(100);
        System.out.println(" ");
        factorOfNumber(100,27);
        System.out.println(" ");
        sumOfFactorOfNumber(100,27);
        System.out.println(" ");
        findSmallestAndLargestNumber();

        //LCM and HCF of number.
        int a = 12;
        int b = 18;
        int hcf = findHCF(a, b);
        int lcm = findLCM(a, b);
        System.out.println("HCF: " + hcf);
        System.out.println("LCM: " + lcm);

    }

    static void printNumber1(){
        for(int i=1;i<=10;i++){
            System.out.print(i+" ");
        }
    }
    static void printNumber2(){
        for(int i=10;i>=1;i--){
            System.out.print(i+" ");
        }
    }
    static void printEvenNumber(){
        for(int i=1;i<=10;i++){
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
    }
    static void printOddNumber(){
        for(int i=1;i<=10;i++){
            if(i%2!=0){
                System.out.print(i+" ");
            }
        }
    }
    static void printTableNumber(int n){
        System.out.print("Table of "+n+" = ");
        for(int i=1;i<=10;i++){
            int store = n*i;
            System.out.print(store + " ");
        }
    }
    static void sumOfN_NaturalNumber(int n){
        int sum=0;
        for(int i=0;i<=n;i++){
            sum=sum+i;
        }
        System.out.print(sum);
    }

    static void sumOfNEvenNumber(int n){
        int sum=0;
        for(int i=0;i<=n;i++){
            if(i%2 == 0){
                sum=sum+i;
            }
        }
        System.out.print(sum);
    }

    static void sumOfNOddNumber(int n){
        int sum=0;
        for(int i=0;i<=n;i++){
            if(i%2 != 0){
                sum=sum+i;
            }
        }
        System.out.print(sum);
    }

    static void factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.print("Factorial of number "+n+" = "+fact);
    }

    static void productOfAllDigit(int number){
        int product = 1;
        System.out.print("Product of number "+number);
        while (number > 0) {
            int digit = number % 10;
            product = product * digit;
            number = number / 10;
        }
        System.out.print(" == "+product);
    }

    static void countNumberOfDigit(int number){
        int count = 0;
        System.out.print("Total Number of digits in "+number);
        while (number > 0) {
            count++;
            number = number / 10;
        }
        System.out.print(" == "+count);
    }

    static void reverseTheNumber(int number){
        int rem, rev =0;
        while(number>0){
            rem = number%10; //Reminder
            rev = (rev*10) + rem;  //Logic
            number = number/10; //Iteration
        }
        System.out.print("Reverse of the number = "+rev);
    }

    static void palindromeNumber(int number){
        int check_Number = number;
        int rem, rev =0;
        while(number>0){
            rem = number%10; //Reminder
            rev = (rev*10) + rem;  //Logic
            number = number/10; //Iteration
        }
        if(check_Number == rev){
            System.out.print("Palindrome");
        }
        else {
            System.out.print("Not Palindrome");
        }
    }

    static void sumOfDigitsOfNumber(int number){
        int sum=0;
        while(number>0){
            int rem = number%10;
            sum = sum+rem;
            number = number/10;
        }
        System.out.print("Sum of digits = "+sum);
    }

    static void armstrongNumber(int number){
        int check_number = number;
        int digits = 0;
        int temp = number;
        //To get the count of number
        while (temp > 0) {
            digits++;
            temp = temp / 10;
        }
        //To check the armstrong
        int result = 0;
        while (number>0){
            int rem = number%10; //This will give me reminder
            result = result + (int) Math.pow(rem, digits);
            number = number/10;
        }
        if(result == check_number){
            System.out.print("Armstrong");
        }else {
            System.out.print("Not Armstrong");
        }
    }

    static void perfectNumber(int number){
        int sum=0;
        int check_number = number;
        for(int i=1;i<number;i++){
            if(number%i==0){
                sum = sum +i;
            }
        }
        if(check_number==sum){
            System.out.print("Perfect Number");
        }else {
            System.out.print("Not Perfect Number");
        }
    }

    static void checkPrimeNumberInRange(){

        for (int i = 2; i <= 100; i++) {
            boolean isPrime = true;
            if (i <= 1) {
                isPrime = false;
            } else {
                for (int j = 2; j * j <= i; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            if (isPrime) {
                System.out.print(+i + " ");
            }
        }

    }

    static void primeNumber(int number){
        boolean isPrime = true;
        if (number <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i * i <= number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }

        }
        if (isPrime) {
            System.out.print(number + " is Prime");
        } else {
            System.out.print(number + " is Not Prime");
        }
    }

    static void fibonacciSeries(int number){
        int a = 0;
        int b = 1;
        System.out.print("Fibonacci Series : ");
        for(int i = 2; i < number; i++){
            int sum = a + b;
            System.out.print(sum + " ");
            a = b;
            b = sum;
        }
    }

    static void fibonacciSeriesSum(int number){
        int a = 0;
        int b = 1;
        int sum = 0;
        for(int i = 2; i < number; i++){
            int next = a + b;
            sum = sum + next;
            a = b;
            b = next;
        }
        System.out.print("Sum of fibonacci series = " + sum);
    }

    static void squareOfNumber(int n){
        float result;
        System.out.print("Square root of the number from 1 to "+n+" = ");
        for(int i=1;i<=n;i++){
            result = (float) Math.sqrt(i);
            System.out.print(result+" ");
        }
    }

    static void cubeOfNumber(int n){
        float result;
        System.out.print("Cube of the number from 1 to "+n+" = ");
        for(int i=1;i<=n;i++){
            result = i * i * i;
            System.out.print(result+" ");
        }
    }

    static void printAllNumberInRange(int lastRange){
        System.out.print("List of the number divisible by 7 from 1 to "+lastRange+" = ");
        for(int i=1;i<=lastRange;i++){
            if(i%7==0){
                System.out.print(i+" ");
            }
        }
    }


    static void factorOfNumber(int lastRange, int number){
        System.out.print("Factor of the "+number+" within the range of 1 to "+lastRange+" = ");
        for(int i=1;i<=lastRange;i++){
            if(number%i==0){
                System.out.print(i+" ");
            }
        }
    }


    static void sumOfFactorOfNumber(int lastRange, int number){
        System.out.print("Sum of factor of the "+number+" within the range of 1 to "+lastRange+" = ");
        int sum =0;
        for(int i=1;i<=lastRange;i++){
            if(number%i==0){
                sum = sum+i;
            }
        }
        System.out.print(sum+" ");
    }

    static void findSmallestAndLargestNumber(){

        int[] arr = {29,43,4,5667,42,33,657,33,56,7575,3,5,6576,2,257,55,34,6};
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Smallest element: " + min);
        System.out.println("Largest element: " + max);
    }

    static int findHCF(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    static int findLCM(int a, int b) {
        return (a * b) / findHCF(a, b);
    }



}
