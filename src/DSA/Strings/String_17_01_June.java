package DSA.Strings;

public class String_17_01_June {
    //Faulty keyboard
    //Input = "poiinter"  && Output = "ponter"
    public static void main(String[] args) {

        //String str = "poiinter";
        String str = "string";
        String finalOutput = finalString(str);
        System.out.println("Output = "+finalOutput);
    }
    public static String finalString(String str) {
        String result = "";
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch == 'i'){
                result = reverse(result);
            } else {
                result = result + ch;
            }
        }
        return result;
    }

    private static String reverse(String result) {

        char[] ch = result.toCharArray();
        int left = 0;
        int right = result.length() - 1 ;
        while (left< right){
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;
            left++;
            right--;
        }
        return new String(ch);

    }

}
/*
Your laptop keyboard is faulty, and whenever you type a character 'i' on it, it reverses the string that you have written.
Typing other characters works as expected.

You are given a 0-indexed string s, and you type each character of s using your faulty keyboard.

Return the final string that will be present on your laptop screen.



Example 1:

Input: s = "string"
Output: "rtsng"
Explanation:
After typing first character, the text on the screen is "s".
After the second character, the text is "st".
After the third character, the text is "str".
Since the fourth character is an 'i', the text gets reversed and becomes "rts".
After the fifth character, the text is "rtsn".
After the sixth character, the text is "rtsng".
Therefore, we return "rtsng".
 */
