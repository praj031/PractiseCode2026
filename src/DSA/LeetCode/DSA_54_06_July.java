package DSA.LeetCode;

import java.util.HashMap;

public class DSA_54_06_July {
    //3. Longest Substring Without Repeating Characters
    public static void main(String[] args) {
        String string = "abcabcbb";
        int length = lengthOfLongestSubstring(string);
        System.out.println("Result = "+length);
    }
    public static int lengthOfLongestSubstring(String string) {
        int low = 0;
        int length = Integer.MIN_VALUE;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int high = 0;high<string.length();high++){
            char ch = string.charAt(high);
            map.put(ch,map.getOrDefault(ch,0)+1);
            while (map.get(ch) > 1){
                char leftChar = string.charAt(low);
                map.put(leftChar , map.get(leftChar) - 1);
                if(map.get(leftChar) == 0){
                    map.remove(leftChar);
                }
                low++;
            }
            length = Math.max(length,high-low+1);
        }
        if(length == Integer.MIN_VALUE){
            return 0;
        }else {
            return length;
        }
    }
}
