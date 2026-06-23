package DSA.Strings;

import java.util.Stack;

public class String_24_23_June {
    public static void main(String[] args) {
        String string = "([])";
        boolean value = isValidBracket(string);
        System.out.println("Output = "+value);
    }

    public static boolean isValidBracket(String string){

        Stack<Character> stack = new Stack<>();
        int n = string.length();

        for(int i=0;i<n;i++){
            char ch = string.charAt(i);

            if(ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);   //This will push the bracket inside the stack.
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                System.out.println("The current character that is being validated = "+stack.peek());
                char lastCharacter = stack.pop();// This will remove the last character from the stack.
                // Check if it matches the current close bracket
                if( (ch == ')' && lastCharacter != '(') ||
                        (ch == '}' && lastCharacter != '{') ||
                        (ch == ']' && lastCharacter != '[')){
                    return false;
                }
            }
        }
        // If stack is empty, all brackets were matched
        // If not empty, some open brackets were never closed
        return stack.isEmpty();
    }

}

/*

As per the question says that the characters or brackets will be always be in a sequence only,
if they ain't in the sequence then u can throw false as output.

 */