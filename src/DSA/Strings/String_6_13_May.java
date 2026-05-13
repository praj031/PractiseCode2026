package DSA.Strings;

public class String_6_13_May {

    //3. Count vowels and consonants in a string.
    public static void main(String[] args) {

        String str = "A man a plan a canal Panama";

        char[] arr = str.toCharArray();
        int count = 0;
        int vowels = 0;
        int consonents = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == ' '){
                count++;
            }
        }
        System.out.println("The number of spaces in the string = "+count);

        String checkString = str.replace(" ","").toLowerCase();
        System.out.println(checkString);
        for(int i=0;i<checkString.length();i++){
            if(checkString.charAt(i) >= 'a' && checkString.charAt(i) <= 'z' ){
                if(checkString.charAt(i) == 'a' || checkString.charAt(i) == 'e'
                || checkString.charAt(i) == 'o' || checkString.charAt(i) == 'i'
                || checkString.charAt(i) == 'u' || checkString.charAt(i) == 's'){
                    vowels++;
                }else{
                    consonents++;
                }
            }
        }
        System.out.println("Number of vowels = "+vowels+" and number of consents are = "+consonents);


    }
}
