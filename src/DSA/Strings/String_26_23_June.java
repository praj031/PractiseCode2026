package DSA.Strings;

public class String_26_23_June {

    public static void main(String[] args) {
        String string = "leetcode";
        String target = "leeto";
        int index = indexOfString(string,target);
        System.out.println("Output = "+index);
    }

    public static int indexOfString(String hayStack, String needle){
        int m =  hayStack.length();
        int n = needle.length();
        for(int i=0;i<=m-n;i++){
            String extract = hayStack.substring(i,i+n);
            if(needle.equals(extract)) {
                return i;
            }
        }
        return -1;
    }

}
/*
28. Find the Index of the First Occurrence in a String
Easy
Topics
premium lock icon
Companies
Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.



Example 1:

Input: haystack = "sadbutsad", needle = "sad"
Output: 0
Explanation: "sad" occurs at index 0 and 6.
The first occurrence is at index 0, so we return 0.
Example 2:

Input: haystack = "leetcode", needle = "leeto"
Output: -1
Explanation: "leeto" did not occur in "leetcode", so we return -1.
 */
