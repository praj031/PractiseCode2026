package DSA.Strings;

public class String_14_21_May {
    //Given a string s consisting of words and spaces, return the length of the last word in the string.
    //
    //A word is a maximal substring consisting of non-space characters only
    public static void main(String[] args) {

        String str = "How are you";

        String[] newStr = str.split(" ");

        int index = newStr.length-1;
        System.out.println(index);

        int lastLength = newStr[index].length();
        System.out.println(lastLength);



    }
}
