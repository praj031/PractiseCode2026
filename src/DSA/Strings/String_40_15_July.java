package DSA.Strings;

public class String_40_15_July {
    //Valid Palindrome
    public static void main(String[] args) {
        String string = "A man, a plan, a canal: Panaama";
        boolean Output = isPalindrome(string);
        System.out.println("Output = "+Output);

    }
    public static boolean isPalindrome(String string) {
        String cleaned = string.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int n = cleaned.length();
        int low = 0;
        int high = n-1;
        char[] ch = cleaned.toCharArray();
        while (low < high){
            char temp = ch[low];
            ch[low] = ch[high];
            ch[high] = temp;
            high--;
            low++;
        }
        String result = new String(ch);
        if(result.equals(cleaned)){
            return true;
        }
        else {
            return false;
        }
    }
}
