package DSA.LeetCode;

public class DSA_50_02_July {
    //1456. Maximum Number of Vowels in a Substring of Given Length
    public static void main(String[] args) {
        String string = "abciiidef";
        int windowSize = 3;
        int count = maxVowels(string,windowSize);
        System.out.println("Count of max vowel in the given window size is = "+count);
    }

    public static int maxVowels(String string, int windowSize) {
        int n = string.length();
        int low = 0;
        int high = windowSize-1;
        int max = Integer.MIN_VALUE;
        while (high < n){
            String checkString = string.substring(low,high+1);
            int count = CountVowels(checkString);
            max = Math.max(max,count);
            low++;
            high++;
        }
        return max;
    }

    private static int CountVowels(String checkString) {
        char[] ch = checkString.toCharArray();
        int count = 0;
        for(int i=0;i<ch.length;i++){
            if(ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u'){
                count++;
            }
        }
        return count;
    }
}
