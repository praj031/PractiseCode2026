package DSA.Strings;

public class String_34_01_July {

    //Longest palindrome from the string. -- with some test case failing
    public static void main(String[] args) {

        String string = "abccccdd";
        String output = String.valueOf(longestPalindrome(string));
        System.out.println("Output = "+output);
    }

    public static int longestPalindrome(String string) {

        int n = string.length();
        int length = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                String current = string.substring(i,j+1);
                if (palindrome(current)){
                    int currentStringLength = current.length();
                    length = Math.max(length,currentStringLength);
                }
            }
        }
        return length;
    }

    private static boolean palindrome(String string) {
        int low = 0;
        int high = string.length() - 1;
        char[] ch = string.toCharArray();
        while (low<high){
            char temp = ch[low];
            ch[low] = ch[high];
            ch[high] = temp;
            low++;
            high--;
        }
        String newString = new String(ch);

        if(newString.equals(string)){
            return true;
        }else {
            return false;
        }

    }

}
