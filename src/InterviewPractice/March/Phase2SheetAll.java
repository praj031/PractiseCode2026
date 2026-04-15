package InterviewPractice.March;

import java.util.Scanner;

public class Phase2SheetAll {

    public static void main(String[] args) {

        //1
        printNumberWithinRange(9,45);
        //2
        System.out.println(" ");
       // numberCheckAndSum();
        System.out.println(" ");
        //numberCheckAndLargestNumber();
        countNumberOfDigits();
        System.out.println(" ");
        reverseTheGivenNumber();
        System.out.println(" ");
        reverseTotalCountTheGivenNumber();

        //Question 12 -- Menu driven program
        MenuDrivenProgram obj = new MenuDrivenProgram();
        //obj.calculator();
        System.out.println(" ");
        //Question 15: Print the sum of even digit and odd digit separate
        printEvenOddDigitsSeparately();



    }

    static void numberCheckAndSum() {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while (true) {
            System.out.print("Enter a number (0 to stop): ");
            int num = sc.nextInt();
            if (num == 0) {
                break;
            }
            sum = sum +  num;
        }
        System.out.print("Sum of entered numbers: " + sum);

        sc.close();
    }

    static void printNumberWithinRange(int begin,int end){
        System.out.print("Range of number : ");
        for(int i = begin;i<=end;i++){
            System.out.print(i+" ");
        }
    }

    static void numberCheckAndLargestNumber() {
        Scanner sc = new Scanner(System.in);

        int max = Integer.MIN_VALUE; // handles negative numbers

        while (true) {
            System.out.print("Enter a number (0 to stop): ");
            int num = sc.nextInt();

            if (num == 0) {
                break;
            }

            if (num > max) {
                max = num;
            }
        }

        if (max == Integer.MIN_VALUE) {
            System.out.println("No numbers entered.");
        } else {
            System.out.println("Largest number = " + max);
        }

        sc.close();

    }

    static void countNumberOfDigits(){
        int number = 124242;
        int count = 0;

        while(number>0){
            count++;
            number = number/10;
        }
        System.out.print("Count = "+count);
    }

    static void reverseTheGivenNumber(){
        int number = 13453;
        int rev = 0;
        while(number>0){
            int rem = number%10;
            rev = (rev * 10) + rem;
            number = number/10;
        }
        System.out.print("Reverse of the number = "+rev);
    }

    static void reverseTotalCountTheGivenNumber(){
        int number = 13453;
        int rev = 0;
        int sum = 0;
        while(number>0){
            int rem = number%10;
            rev = (rev * 10) + rem; //taking the reminder out of the number
            sum = sum + rem; // Takes the sum of each number
            number = number/10; //Reset the count basically
        }
        System.out.print("Reverse of the number = "+rev);
        System.out.println(" ");
        System.out.print("Sum of reversed number = "+sum);
    }

    static void printEvenOddDigitsSeparately(){
        int number = 13453;
        System.out.println("Gop Gop ");
        int rev = 0;
        while(number>0){
            int rem = number%10;
            rev = (rev * 10) + rem;
            if(rem%2==0){
                System.out.println("Even value = "+rem);
            }
            if(rem%2!=0){
                System.out.println("Odd values = "+rem);
            }
            number = number/10;
        }
    }




}