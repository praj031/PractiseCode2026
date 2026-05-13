package DSA.Strings;

public class String_5_12_May {
    //Palindrome String
    public static void main(String[] args) {

        String str = "A man, a plan, a canal: Panama";

//        String withoutComma = str.replace(",","");
//        String withoutSpace = withoutComma.replace(" ","");
//        String withoutCollen = withoutSpace.replace(":","");
//        String FinalCheckString = withoutCollen.toLowerCase();

        String FinalCheckString = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();


        int left = 0;
        int right = FinalCheckString.length() - 1;

        char[] arr = FinalCheckString.toCharArray();
        char temp;

        while(left < right){
            temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        String reversed = new String(arr);

        if(FinalCheckString.equals(reversed)){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not Palindrome");
        }
    }
}
