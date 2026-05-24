package DSA.LeetCode;

import java.util.Arrays;

public class DSA_34_24_May {

    //5. Count Occurrences of Anagrams

    public static void main(String[] args) {


        String target = "for";
        char[] arrTarget = target.toCharArray();
        Arrays.sort(arrTarget);
        String sortedCompare = new String(arrTarget);  //This will be compared with the final string
        int k = target.length();


        String str = "forxxorfxdofr";
        int count = 0;
        for(int i=0;i<str.length()-k;i++){
            // Extract window
            String temp = str.substring(i, i + k);
            // Sort current window
            char[] arr = temp.toCharArray();
            Arrays.sort(arr);
            String finalStr = new String(arr);
            // Compare
            if (finalStr.equals(sortedCompare)) {
                count++;
            }
        }
        System.out.println(count);
    }

}

/*
Approach will be like
1. For target string :
       1. Get the size which will be sliding window size.
       2. Convert it to sorted string
       3. Save it for later compare
2. For main given string
       1. One loop will iterate to the lenght - sliding window size.
       2. We will sxtract the substring from the first to k lentht
       3. Compare it with the saved string
3. Get the count of each comparison.

 */
