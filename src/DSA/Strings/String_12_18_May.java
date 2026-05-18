package DSA.Strings;

public class String_12_18_May {
    //valid palindrome string
    public static void main(String[] args) {

        String str = "A man, a plan, a canal: Panama";
        String finalString = str.replaceAll("[^a-zA-Z0-9]","").toLowerCase();

        int left =0;
        int right =finalString.length()-1;
        char[] arr = finalString.toCharArray();
        while (left<right){
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        String newStr = new String(arr);
        if(newStr.equals(finalString)){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not Palindrome");
        }

    }
}
