package DSA.Strings;

public class String_38_06_July {
    //2264. Largest 3-Same-Digit Number in String
    public static void main(String[] args) {
        String string = "6777133339";
        String result = largestGoodInteger(string);
        System.out.println("Output = "+result);
    }
    public static String largestGoodInteger(String string) {
        int length = 3;
        int maxLength = -1;
        int checkValue;
        for(int low = 0; low <= string.length() - 3; low++){
            String newString = string.substring(low,low+length);
            if(newString.charAt(0) == newString.charAt(1) && newString.charAt(1) == newString.charAt(2)){
                checkValue = Integer.parseInt(newString);
                maxLength = Math.max(maxLength,checkValue);
            }
            low++;
        }
        if (maxLength == -1) {
            return "";
        }

        if (maxLength == 0) {
            return "000";
        }
        return String.valueOf(maxLength);
    }
}
