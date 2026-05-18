package DSA.LeetCode;

public class DSA_13_22_April {

    //is palindrome

    public static void main(String[] args) {

        String s = "A man, a plan, a canal: Panama";

        int left = 0;
        int right = s.length() - 1;

        while(left < right){

            while(left < right && !Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }
            while(left < right && !Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }

            if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
                System.out.println("Not Palindrome");
            }

            left++;
            right--;

        }
        System.out.println("Palindrome");

    }

}
