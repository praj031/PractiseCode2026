package DSA.Strings;

import java.util.Stack;

public class String_28_25_June {

    //125. Valid Palindrome
    public static void main(String[] args) {

        String string = "A man, a plan, a canal: Panama";
        boolean output = isPalindrome(string);
        System.out.println("Output = "+output);

    }

    static boolean isPalindrome(String string){

        String cleaned = string.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        char[] ch = cleaned.toCharArray();
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<cleaned.length();i++){
            stack.push(ch[i]);
        }
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }
        return cleaned.equals(reversed.toString());
    }

}
