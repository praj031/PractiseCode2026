package DSA.Strings;

import java.util.Arrays;

public class String_3_12_May {
    //Remove spaces from the string
    public static void main(String[] args) {
        String str = "My,name,is,khan,and,i,am,not,a,god";

        String lowarcaseString = str.toLowerCase();
        System.out.println("Convert the string in the lower case  == "+lowarcaseString);

        String[] strArr = str.split(",");
        System.out.println("Array of String = "+ Arrays.toString(strArr));

        String replacedString = str.replace(",", " ");
        System.out.println(replacedString);


    }
}
