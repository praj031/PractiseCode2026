package DSA.Strings;

public class String_21_03_June {
    //compare 2 string and return the values of common character
    //eg: flight , flower === Output -> fl
    public static void main(String[] args) {

        String str1 = "flower";
        String str2 = "flight";

        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        String output = "";

        int minLength = Math.min(ch1.length, ch2.length);

        for(int i=0;i<minLength;i++){
            if(ch1[i] == ch2[i]){
                output = output + ch1[i];
            }
            else {
                break;
            }
        }

        System.out.println("Output = "+output);


    }
}
