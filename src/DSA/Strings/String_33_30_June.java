package DSA.Strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class String_33_30_June {
    //2287. Rearrange Characters to Make Target String
    public static void main(String[] args) {
        String s = "ilovecodingonleetcode";
        String target = "code";
        int output = rearrangeCharacters(s,target);
        System.out.println("Output = "+output);
    }
    public static int rearrangeCharacters(String s, String target) {
        HashMap<Character,Integer> sCount = new HashMap<>();
        HashMap<Character,Integer> targetCount = new HashMap<>();

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            sCount.put(ch,sCount.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<target.length();i++){
            char ch = target.charAt(i);
            targetCount.put(ch,targetCount.getOrDefault(ch,0)+1);
        }

        List<Character> keySet = new ArrayList<>(targetCount.keySet());
        int result = Integer.MAX_VALUE;

        for(int i=0;i<keySet.size();i++){
            char ch = keySet.get(i);
            int sContCC = sCount.getOrDefault(ch,0);
            int targetCountCC = targetCount.get(ch);

            result = Math.min(result,sContCC/targetCountCC);

        }
        return  result;

    }
}
