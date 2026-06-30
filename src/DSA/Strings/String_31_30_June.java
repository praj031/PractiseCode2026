package DSA.Strings;

import java.util.HashMap;

public class String_31_30_June {
    //LC 383 Ransom Note
    public static void main(String[] args) {
        String ransom = "aa";
        String magazine = "aab";
        boolean value = canConstruct(ransom,magazine);
        System.out.println("Output = "+value);
    }

    private static boolean canConstruct(String ransom, String magazine) {

        HashMap<Character,Integer> letterCount = new HashMap<>();

        for(int i=0;i<magazine.length();i++){
            char ch = magazine.charAt(i);
            letterCount.put(ch,letterCount.getOrDefault(ch,0)+1); //To store the magazine each letter frequency in the hashmap
        }

        for(int i=0;i<ransom.length();i++){
            char ch = ransom.charAt(i);
            int count = letterCount.getOrDefault(ch,0);  //For each letter in the ransom string w are going to fetch the count in the letterCount hashmap.

            System.out.println(count);

            if(count == 0){
                return false;  //If any letter is not finding you going to return false
            }

            letterCount.put(ch, count-1);  //For each letter find you will be reducing the letter count
        }

        return true;

    }

}
