package DSA.Strings;

import java.util.Arrays;

public class String_13_18_May {
    //valid anagram

    public static void main(String[] args) {

        String s = "rat";
        String n = "cat";
        char[] arrS = s.toCharArray();
        Arrays.sort(arrS);
        String finalS = new String(arrS);
        char[] arrN = n.toCharArray();
        Arrays.sort(arrN);
        String finalN = new String(arrN);
        if(finalS.equals(finalN)){
            System.out.println("Valid anagram");
        }
        else {
            System.out.println("Not valid anagram");
        }
    }

}
