package DSA.LeetCode;

public class DSA_40_31_May {
    //345. Reverse Vowels of a String
    public static void main(String[] args) {
        String str = "IceCreAm";
        String finalString = reverseVowels(str);
        System.out.println("Final String = "+finalString);
    }

    static String reverseVowels(String str) {

        char[] arr = str.toCharArray();
        int n = arr.length;
        int left = 0;
        int right = n-1;
        while (left < right){

            while (!isVowel(arr[left])){
                left ++;
            }
            while (!isVowel(arr[right])){
                right --;
            }

            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left ++;
            right --;
        }
        return new String(arr);
    }

    static boolean isVowel(char ch){
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}


/*

        String str = "IceCreAm";
        char[] arr = str.toCharArray();
        int n = arr.length;
        int left = 0;
        int right = n-1;
        while(left < right){

            if(arr[left] == 'a' || arr[left] == 'e' || arr[left] == 'i' || arr[left] == 'o' || arr[left] == 'u' ||
                    arr[right] == 'a' || arr[right] == 'e' || arr[right] == 'i' || arr[right] == 'o' || arr[right] == 'u'
            || arr[left] == 'A' || arr[left] == 'E' || arr[left] == 'I' || arr[left] == 'O' || arr[left] == 'U' ||
                    arr[right] == 'A' || arr[right] == 'E' || arr[right] == 'I' || arr[right] == 'O' || arr[right] == 'U'){

                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left ++;
                right --;
            }
            System.out.println(new String(arr));
        }

 */