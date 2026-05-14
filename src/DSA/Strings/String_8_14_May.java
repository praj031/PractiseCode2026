package DSA.Strings;

public class String_8_14_May {
    //5. Remove all whitespaces from a string.
    //6. Convert lowercase to uppercase without using built-in methods.
    public static void main(String[] args) {

        String str = "My NaMe is KHAN and i aM not a terrOrist i AM a good bOY";
        str = str.replaceAll(" ","");
        System.out.println("Replaces string = "+str);
        int upperCase = 0;
        int lowerCase = 0;
        char[] arr = str.toCharArray();
        for(int i=0;i<str.length();i++){
            //System.out.print(arr[i] + " ");

            // Uppercase to lowercase
            if(arr[i] >= 'A' && arr[i] <= 'Z') {
                arr[i] = (char)(arr[i] + 32);
                upperCase++;
            }
            // Lowercase to uppercase
            else if(arr[i] >= 'a' && arr[i] <= 'z') {
                arr[i] = (char)(arr[i] - 32);
                lowerCase++;
            }
        }
        System.out.println(upperCase + "  &   " +lowerCase);
        System.out.print("Converted String = ");
        System.out.print(arr);

    }
}
