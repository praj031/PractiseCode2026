package DSA.LeetCode;

public class DSA_38_26_May {
    /*
    You are given a string s consisting only lowercase alphabets and an integer k.
    Your task is to find the length of the longest substring that contains exactly k distinct characters.
     */
    public static void main(String[] args) {

        String str = "aabacbebebe";
        int k = 3;
        int finalLength = longestKSubstr(str,k);
        System.out.println("Final length of string = "+finalLength);
    }

    public static int longestKSubstr(String str, int k){
        int maxLen = -1;
        for(int i = 0; i < str.length(); i++) {
            int[] freq = new int[26];
            int distinct = 0;
            for(int j = i; j < str.length(); j++) {
                char ch = str.charAt(j);
                if(freq[ch - 'a'] == 0) {
                    distinct++;
                }
                freq[ch - 'a']++;
                int length = j-i+1;
                if(distinct == k) {
                    maxLen = Math.max(maxLen,length);
                }
                if(distinct > k) {
                    break;
                }
            }
        }
        return maxLen;
    }
}
