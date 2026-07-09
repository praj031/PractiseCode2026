package DSA.Strings;

import java.util.HashMap;

public class String_39_07_July {
    //Longest Repeating Character Replacement
    public static void main(String[] args) {
        String string = "ABAB";
        int replacement = 2;
        int result = characterReplacement(string,replacement);
        System.out.println("Output = "+result);
    }
    public static int characterReplacement(String string, int k) {

        int low = 0;
        int maxLength = 0;
        int replacementNeeded = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int high = 0; high<string.length();high++){
            char ch = string.charAt(high);
            map.put(ch,map.getOrDefault(ch,0)+1);//We get the frequency of the current character in the windows
            maxLength = Math.max(maxLength , map.get(ch)); //By doing this we get the max length of the current window.
            while ((high - low + 1) - maxLength > k){ //We get the current window size
                char leftChar = string.charAt(low); //We remove the left characcter after we surpass the lenght of replacement needed.
                map.put(leftChar, map.get(leftChar)-1); //Removing the character from the map
                low++; //Increasing the window size.
            }
            replacementNeeded = Math.max(replacementNeeded , high-low+1); //If there is replacement needed.
        }
        return replacementNeeded;
    }
}
//