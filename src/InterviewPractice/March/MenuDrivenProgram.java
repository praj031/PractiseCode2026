package InterviewPractice.March;

import java.util.Scanner;

public class MenuDrivenProgram {

    public void calculator(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the operation you want to perform, from the below options");
        System.out.println("1 -- Addition of numbers ");
        System.out.println("2 -- Substraction of the numbers");
        System.out.println("3 -- Multiplication of the numbers");
        System.out.println("4 -- Division of the numbers");
        System.out.print("Choose the option = ");
        int option = sc.nextInt();
        System.out.println(" ");
        System.out.print("Enter first parameter a = ");
        int a = sc.nextInt();
        System.out.println(" ");
        System.out.print("Enter second parameter b = ");
        int b = sc.nextInt();
        int result;
        System.out.println(" ");

        switch (option){

            case 1: result = a+b;
                System.out.print("Value after computation = "+result);
                    break;
            case 2: result = a-b;
                System.out.print("Value after computation = "+result);
                break;
            case 3: result = a*b;
                System.out.print("Value after computation = "+result);
                break;
            case 4: result = a/b;
                System.out.print("Value after computation = "+result);
                break;
            default:
                System.out.println("Incorrect Option selected, please recheck");

        }

    }


}
