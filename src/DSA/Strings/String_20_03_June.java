package DSA.Strings;

public class String_20_03_June {
    //14. Longest Common Prefix

    public static void main(String[] args) {
        String[] str = {"flower","flow","flight"};
        //output = "fl"
        String finalString = longestCommonPrefix(str);
        System.out.println("Output = "+finalString);
    }

    private static String longestCommonPrefix(String[] str) {
        String output = "";
        int length = str[0].length(); //Taking reference length
        for (int i = 0; i < length; i++) {  //Iterating as for max length
            char ch = str[0].charAt(i); //Converting the first comparing string to character array
            for (int j = 1; j < str.length; j++) { //start comparing from the second string which will go till the length of string
                if (i >= str[j].length() || str[j].charAt(i) != ch) { // Check the length and not equals
                    return output; //Return op
                }
            }
            output += ch; //if found add the character
        }
        return output;
    }
}
