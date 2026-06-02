package DSA.Strings;

public class String_19_02_June {
    //Reverse specific index of string
    public static void main(String[] args) {
        String str = "abcdef";
        int rotation = 2;
        String finalString = reverseStr(str,rotation);
        System.out.println("Output = "+finalString);
    }

    static String reverseStr(String str, int k){

        String firstString = str.substring(0,k);
        String secondString = str.substring(k);
        String firstStringReversed = reverse(firstString);
        return firstStringReversed + secondString;
    }

    static String reverse(String str){

        int low = 0;
        int high = str.length() - 1;
        char[] arr = str.toCharArray();
        while (low < high){
            char temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
        return new String(arr);

    }


}
/*
Given a string s and an integer k, reverse the first k characters for every 2k characters counting from the start of the string.

If there are fewer than k characters left, reverse all of them. If there are less than 2k but greater than or equal to k characters, then reverse the first k characters and leave the other as original.



Example 1:

Input: s = "abcdefg", k = 2
Output: "bacdfeg"
Example 2:

Input: s = "abcd", k = 2
Output: "bacd"


Constraints:

1 <= s.length <= 104
s consists of only lowercase English letters.
1 <= k <= 104
 */