package InterviewPractice.January2026;

public class StringConversion {

    static void main(String[] args) {

        String str = "       Pritish Raj";
        builtInMethod(str);
        authenticMethod(str);
        moreBuiltInMethod(str);

    }

    private static void authenticMethod(String str) {

        StringBuilder lowerCase = new StringBuilder();
        StringBuilder upperCase = new StringBuilder();
        for(int i=0;i<str.length();i++){
            char ch_l = str.charAt(i);
            char ch_u = str.charAt(i);

            if(ch_l >= 'A' && ch_l <='Z'){
                ch_l = (char) (ch_l + 32);
            }
            lowerCase.append(ch_l);

            if(ch_u >= 'a' && ch_u <= 'z'){
                ch_u = (char) (ch_u - 32);
            }
            upperCase.append(ch_u);
        }
        System.out.println("Value of lowercase string using authentic method = "+lowerCase);
        System.out.println("Value of uppercase string using authentic method = "+upperCase);
    }

    private static void builtInMethod(String str) {

        System.out.println("String to lower case using built in method = "+str.toLowerCase());
        System.out.println("String to upper case using built in method = "+str.toUpperCase());

    }

    private static void moreBuiltInMethod(String str){
        System.out.println(str.trim()); //this trims the space in-front of the string
        System.out.println(str.charAt(12));
    }

}
