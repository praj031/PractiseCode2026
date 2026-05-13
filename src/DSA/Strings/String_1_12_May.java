package DSA.Strings;

public class String_1_12_May {

        public static void main(String[] args) {
            traverseThroughString();
            System.out.println();
            countNumberOfSpaces();
            System.out.println();
            reverseString();
        }

        static void traverseThroughString(){
            //Traverse in string
            String str = "I love DSA";
            int length = str.length();
            for(int i=0;i<length;i++){
                System.out.print(str.charAt(i) + " ");
            }
        }

        static void countNumberOfSpaces(){
            //Count the number of spaces in it.
            String str = "I love DSA";
            int spaceCount = str.length() - str.replace(" ","").length();
            System.out.println("Total Number of space = "+spaceCount);
        }

        static void reverseString(){
            //Check if the string is palindrome or not.
            String str = "A man, a plan, a canal: Panama";
            String result = str.replaceAll("[^a-zA-Z0-9]", "");
            String finalString = result.toLowerCase();
            System.out.println("Final string to be reversed = "+finalString);
            char[] arr = finalString.toCharArray();
            int left = 0;
            int right = finalString.length() - 1;
            while (left < right){
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
            System.out.println("Reversed String = "+new String(arr));
            if(finalString.equals(new String(arr))){
                System.out.println("String is Palindrome");
            }
            else {
                System.out.println("String is Not Palindrome");
            }
        }




}
