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

    public static int longestKSubstr(String s, int k){
        int[] freq = new int[26]; //Stores frequency of characters in the current window.
        int left = 0; //Left boundary of the window.
        int distinct = 0; //Stores distinct counts
        int maxLen = -1; //Default max length
        for (int right = 0; right < s.length(); right++) { //
            char ch = s.charAt(right);
            if (freq[ch - 'a'] == 0) {
                distinct++;
            }
            freq[ch - 'a']++;
            while (distinct > k) {
                char leftChar = s.charAt(left);
                freq[leftChar - 'a']--;
                if (freq[leftChar - 'a'] == 0) {
                    distinct--;
                }
                left++;
            }

            if (distinct == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }
        }
        return maxLen;
    }
}
