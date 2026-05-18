package DSA.LeetCode;

import java.util.Locale;

public class DSA_14_23_April {

    public static void main(String[] args) {

        //Frequency of the character in the string
        String str = "loveleetcode";

        int[] freq = new int[26]; //Signifies the total letter in the alphabet.

        String lowerString = str.toLowerCase(Locale.of(str)); //to convert the given string in lowercase, to be constant behavior.

        for(int i=0;i<lowerString.length();i++){
            char ch = lowerString.charAt(i);
            freq[ch - 'a']++;   //This is how we get the frequency
        }

        for(int i=0;i<lowerString.length();i++){
            if(freq[i] > 0){
                System.out.println((char) (i+'a')+" "+freq[i]);
            }
        }



    }

}
