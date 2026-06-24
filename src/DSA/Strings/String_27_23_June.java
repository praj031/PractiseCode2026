package DSA.Strings;

import java.util.Stack;

public class String_27_23_June {
    public static void main(String[] args) {
        String string = "applee";
        String result = duplicateRemoval(string);
        System.out.println("Output = "+result);
    }

    public static String duplicateRemoval(String string){

        Stack<Character> stack = new Stack<>();

        char[] ch = string.toCharArray();

        for (int i = 0; i < ch.length; i++) {

            if (!stack.isEmpty() && ch[i] == stack.peek()) {
                stack.pop();
            } else {
                stack.push(ch[i]);
            }
        }

        StringBuilder result = new StringBuilder();

        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        return result.reverse().toString();
    }

}
