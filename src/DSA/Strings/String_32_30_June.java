package DSA.Strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class String_32_30_June {

    //1189. Maximum Number of Balloons
    //2287. Rearrange Characters to Make Target String
    public static void main(String[] args) {
        String text = "loonbalxballpoon";
        int output = maxNumberOfBalloons(text);
        System.out.println("Output = "+output);
    }
    public static int maxNumberOfBalloons(String text) {

        String target = "balloon";

        HashMap<Character,Integer> textCount = new HashMap<>();
        HashMap<Character,Integer> targetCount = new HashMap<>();

        for(int i=0;i<text.length();i++){
            char ch = text.charAt(i);
            textCount.put(ch,textCount.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<target.length();i++){
            char ch = target.charAt(i);
            targetCount.put(ch,targetCount.getOrDefault(ch,0)+1);
        }

        List<Character> keySet = new ArrayList<>(targetCount.keySet());
        int result = Integer.MAX_VALUE;

        for(int i=0;i<keySet.size();i++){
            char ch = keySet.get(i);
            int textCC = textCount.getOrDefault(ch,0);
            int targetCC = targetCount.get(ch);
            result = Math.min(result , textCC/targetCC);
        }

        return result;


    }



}
