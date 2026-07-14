package DSA.LeetCode;

import java.util.HashMap;

public class DSA_65_14_July {
    //Frequency of the letter in a word
    public static void main(String[] args) {

        String string = "ADOBECODEBANC";
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0;i<string.length();i++){
            char ch = string.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        System.out.println(map);
    }

}
