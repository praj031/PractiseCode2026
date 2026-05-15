package DSA.Strings;

import java.util.Arrays;

public class String_11_14_May {
    //Valid Anagram
    public static void main(String[] args) {

        String str1 = "anagram";
        String str2 = "nagaram";

        char[] arr1 = str1.toCharArray();
        Arrays.sort(arr1);
        String sorted1 = new String(arr1);

        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr2);
        String sorted2 = new String(arr2);

        if(sorted2.equals(sorted1)){
            System.out.println("Valid Anagram");
        }
        else {
            System.out.println("Not Valid Anagram");
        }


    }
}
