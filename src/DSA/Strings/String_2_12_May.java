package DSA.Strings;

public class String_2_12_May {
    //Program to reverse a string using 2 pointers.
    public static void main(String[] args) {

        String str = "Pritish"; //Take a string
        char[] arr = str.toCharArray(); //As string is collection of characters we can convert it to array of characters
        int left = 0;  //Pointer 1
        int right = str.length() - 1;//Pointer 2
        char temp; //Temporary variable to store array.
        while (left < right){
            temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right --;
        }
        System.out.println("Reversed String = "+new String(arr)); //After reversing i am getting new string so will add the new array.
    }
}
