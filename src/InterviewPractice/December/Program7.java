package InterviewPractice.December;

import java.util.Scanner;

public class Program7 {

    //Check if a given string is a palindrome (reads the same forward and backward) using a loop, without using built‑in reverse methods.
    public static void main(String[] args) {

        String PalindromeString;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string = ");

        PalindromeString = sc.nextLine();

        boolean value = stringPalindromeCheck(PalindromeString);
        if(value == true){
            System.out.println("String is Palindrome");
        }
        else {
            System.out.println("String is Not Palindrome");
        }
    }

    static boolean stringPalindromeCheck(String str){

        int start = 0;
        int end = str.length()-1;
        String newString = "";

        while (end >= start){
            //This will convert the string to reverse
            newString = newString + str.charAt(end);
            end --;
        }

        //System.out.println(newString);

        if(newString.equals(str)){
            return true;
        }
        else {
            return false;
        }

    }


}
