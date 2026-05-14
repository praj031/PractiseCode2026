package DSA.Strings;

public class String_10_14_May {
    //5. Remove all whitespaces from a string.
    public static void main(String[] args) {

        String str = "Java is very easy";
        str = str.replaceAll(" ","");
        System.out.println("The updated string = "+str);

    }
}
