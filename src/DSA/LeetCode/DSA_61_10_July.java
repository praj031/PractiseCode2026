package DSA.LeetCode;

import java.util.HashMap;

public class DSA_61_10_July {
    //Frequency of the string's character
    public static void main(String[] args) {
        String string = "abdcaabcde";
        HashMap<Character,Integer> outPutMap = getFrequency(string);
        System.out.println("Output = "+outPutMap);
    }
    public static HashMap<Character, Integer> getFrequency(String string){
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<string.length();i++){
            char ch = string.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        return map;
    }
}
