package DSA.Strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class String_35_01_July {
    //Longest palindrome
    public static void main(String[] args) {
        String string = "a";
        int output = longestPalindrome(string);
        System.out.println("Output = "+output);
    }

    private static int longestPalindrome(String string) {

        int length = string.length();
        HashMap<Character,Integer> count = new HashMap<>();
        for(int i=0;i<length;i++){
            char ch = string.charAt(i);
            count.put(ch , count.getOrDefault(ch,0)+1);
        }
        int result = 0;
        boolean hasOdd = false;
        List<Character> keySet = new ArrayList<>(count.keySet());
        for(int i=0;i<keySet.size();i++){
            char ch = keySet.get(i);
            int charCount = count.get(ch);
            result = result + (charCount / 2) * 2;

            if(charCount % 2 != 0 ){
                hasOdd = true;
            }

        }
        if(hasOdd){
            result++;
        }
        return result;
    }

}
