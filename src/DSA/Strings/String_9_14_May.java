package DSA.Strings;

public class String_9_14_May {
    //Count the number of upper and lowercase letter
    public static void main(String[] args) {

        String str =  "My NaMe is KHAN and i aM not a terrOrist i AM a good bOY";
        int lowerCase = 0;
        int upperCase = 0;
        char[] arr = str.toCharArray();
        for(int i=0;i< arr.length;i++){
            if(arr[i] >= 'a' && arr[i]  <= 'z'){
                lowerCase++;
            }
            if(arr[i]  >= 'A' && arr[i]  <= 'Z'){
                upperCase++;
            }
        }
        System.out.println("Lowercase characters are = "+lowerCase+" & upper case character = "+upperCase);

    }
}
