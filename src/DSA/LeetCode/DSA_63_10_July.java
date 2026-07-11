package DSA.LeetCode;

import java.util.HashMap;

public class DSA_63_10_July {
    //567. Permutation in String
    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "eidboaoo";
        boolean output = checkInclusion(s1,s2);
        System.out.println("Output = "+output);
    }

    public static boolean checkInclusion(String s1, String s2) {

        int k = s1.length();
        HashMap<Character,Integer> map1 = new HashMap<>();
        for(int i=0;i<s1.length();i++){
            char ch = s1.charAt(i);
            map1.put(ch,map1.getOrDefault(ch,0)+1);
        }
        int low = 0;
        HashMap<Character,Integer> map2 = new HashMap<>();
        for(int high = 0;high<s2.length();high++){
            char ch = s2.charAt(high);
            map2.put(ch,map1.getOrDefault(ch,0)+1);
            if (high - low + 1 > k) {
                char leftChar = s2.charAt(low);
                map2.put(leftChar, map2.get(leftChar) - 1);
                if (map2.get(leftChar) == 0) {
                    map2.remove(leftChar);
                }
                low++;
            }
            if(high-low+1 == k){
                if(map2.equals(map1)){
                    return true;
                }
            }
        }
        return false;
    }
}
