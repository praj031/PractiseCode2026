package DSA.LeetCode;

import java.util.HashMap;

public class DSA_64_13_July {
    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        String Output = minWindow(s,t);
        System.out.println("Final Sub String = "+Output);

    }
    public static String minWindow(String s, String t) {

        HashMap<Character, Integer> map1 = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            map1.put(ch, map1.getOrDefault(ch, 0) + 1);
        }
        int low = 0;
        int neededSize = map1.size();
        int formed = 0;
        int minSize = Integer.MAX_VALUE;
        HashMap<Character, Integer> map2 = new HashMap<>();
        int start = 0;
        for (int high = 0; high < s.length(); high++) {
            char ch = s.charAt(high);
            map2.put(ch, map2.getOrDefault(ch, 0) + 1);
            if (map1.containsKey(ch)
                    && map2.get(ch).intValue() == map1.get(ch).intValue()) {
                formed++;
            }
            while (formed == neededSize) {
                if (high - low + 1 < minSize) {
                    minSize = high - low + 1;
                    start = low;
                }
                char leftChar = s.charAt(low);
                map2.put(leftChar, map2.get(leftChar) - 1);
                if (map1.containsKey(leftChar)
                        && map2.get(leftChar) < map1.get(leftChar)) {
                    formed--;
                }
                low++;
            }
        }
        if (minSize == Integer.MAX_VALUE)
            return "";
        return s.substring(start, start + minSize);
    }
}
