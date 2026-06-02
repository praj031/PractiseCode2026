package DSA.Strings;

public class String_18_02_June {
    //Input: s = "ab-cd"
    //Output: "dc-ba"
    public static void main(String[] args) {
        String str = "7_28]";
        //String str = "ab-cd";
        String finalString = reverseOnlyLetters(str);
        System.out.println("Output = "+finalString);
    }

    private static String reverseOnlyLetters(String str) {
        String result = "";

        int length = str.length();
        int left = 0;
        int right = length - 1;
        char[] arr = str.toCharArray();

        while (left < right){
            if(arr[left] == '-' ){
                left++;
            }
            if(arr[right] == '-' ){
                right--;
            }

            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
        result = new String(arr);
        return result;
    }

}

/*
917. Reverse Only Letters
Easy
Topics
premium lock icon
Companies
Hint
Given a string s, reverse the string according to the following rules:

All the characters that are not English letters remain in the same position.
All the English letters (lowercase or uppercase) should be reversed.
Return s after reversing it.



Example 1:

Input: s = "ab-cd"
Output: "dc-ba"
Example 2:

Input: s = "a-bC-dEf-ghIj"
Output: "j-Ih-gfE-dCba"
Example 3:

Input: s = "Test1ng-Leet=code-Q!"
Output: "Qedo1ct-eeLg=ntse-T!"
 */