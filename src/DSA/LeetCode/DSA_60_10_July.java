package DSA.LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DSA_60_10_July {
    //Find all anagrams in the string
    public static void main(String[] args) {
        String s = "cbaebabacd";
        String p = "abc";
        System.out.println(findAnagrams(s,p));
    }
    public static List<Integer> findAnagrams(String s, String p) {
        int k = p.length();
        List<Integer> result = new ArrayList<>();
        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();
        for(int i=0;i<p.length();i++){
            char ch = p.charAt(i);
            map1.put(ch, map1.getOrDefault(ch,0)+1);
        }
        int low = 0;
        for(int high = 0;high<s.length();high++){
            char ch = s.charAt(high);
            map2.put(ch,map2.getOrDefault(ch,0)+1);
            if(high-low+1 > k){
                char lefChar = s.charAt(low);
                map2.put(lefChar, map2.get(lefChar)-1);
                if(map2.get(lefChar) == 0){
                    map2.remove(lefChar);
                }
                low++;
            }
            if(high-low+1 ==k){
                if(map2.equals(map1)){
                    result.add(low);
                }
            }
        }
        return result;
    }
}
