package DSA.Strings;

import java.util.Stack;

public class String_36_01_July {
    //Reverse a string using stack DS
    public static void main(String[] args) {
        String string = "Pritish";
        Stack<Character> stack = new Stack<>();
        char[] ch = string.toCharArray();
        for(int i=0;i<ch.length;i++){
            stack.push(ch[i]);
        }
        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()){
            result.append(stack.pop());
        }
        System.out.println("Reverse a string = "+result);
    }
}
