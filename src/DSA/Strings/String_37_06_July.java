package DSA.Strings;

import java.util.HashMap;

public class String_37_06_July {
    //Longest Substring with K Uniques
    public static void main(String[] args) {
        String string = "aabacbebebe";
        int k = 3;
        int length =  longestKSubstr(string,k);
        System.out.println("Output = "+length);
    }

    public static int longestKSubstr(String string, int k) {

        int left = 0;
        int maxLength = -1;

        HashMap<Character,Integer> map = new HashMap<>();
        for(int right = 0;right < string.length();right++){
            char ch = string.charAt(right);
            map.put(ch , map.getOrDefault(ch,0)+1);  //By doing this we get the frequency of the map

            while (map.size() > k){
                char leftChar = string.charAt(left);
                map.put(leftChar,map.get(leftChar)-1); // By doing this we are removing the left most characters frequency
                if(map.get(leftChar) == 0){
                    map.remove(leftChar);//Removing the left most character from the window and shrinking the window.
                }
                left ++;
            }
            if(map.size() == k){
                maxLength = Math.max(maxLength, right - left + 1); //This will find the max length of the substring
            }

        }

        return maxLength;

    }
}
