package DSA.LeetCode;

import java.util.HashMap;

public class DSA_62_10_July {
    //Suppose i have 2 string and i need to check string 1 contains string 2 so i will create 2 hash map and compare ?
    //remember in hashmap we can compare the string frequency as well
    //Valid anagram.
    public static void main(String[] args) {
        String s = "anagram";
        String t  = "nagaram";
        boolean result = isAnagram(s,t);
        System.out.println(result);
    }
    public static boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            map1.put(ch,map1.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<t.length();i++){
            char ch = t.charAt(i);
            map2.put(ch,map2.getOrDefault(ch,0)+1);
        }

        if (map2.equals(map1)){
            return true;
        }else {
            return false;
        }


    }

}
