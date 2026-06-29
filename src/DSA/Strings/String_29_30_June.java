package DSA.Strings;

import java.util.HashMap;

public class String_29_30_June {
    //Frequency of each character in string
    public static void main(String[] args) {
        String string = "aappccfhghwefheshdshjrssgaahgtaefaagdsh";
        frequencyOfEachCharacterInString(string);
    }

    public static void frequencyOfEachCharacterInString(String string){
        int n = string.length();
        HashMap<Character,Integer> freq = new HashMap<>();
        for(int i=0;i<n;i++){
            char ch = string.charAt(i);
            freq.put(ch, freq.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<n;i++){
            char ch = string.charAt(i);
                        System.out.println(ch+" == "+freq.get(ch));
        }
    }

}
