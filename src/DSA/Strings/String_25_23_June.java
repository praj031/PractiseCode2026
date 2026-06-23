package DSA.Strings;

import java.util.Stack;

public class String_25_23_June {
    //Reverse a string using stack
    public static void main(String[] args) {

        String string = "Pritish";
        Stack<Character> stack = new Stack<>();
        int length = string.length();
        for(int i=0;i<length;i++){
            char ch = string.charAt(i);
            stack.push(ch);
        }
        StringBuilder result = new StringBuilder();
        for(int i=0;i<length;i++){
            result.append(stack.pop());
        }
        System.out.println("Final string = "+result);
    }
}
