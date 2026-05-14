package DSA;

import java.util.Arrays;

public class DSA_18_14_May {
    //Find the 3rd largest element in the array
    public static void main(String[] args) {
        //General way fo checking the 3rd largest element of the array. -
        //By sorting the array into ascending order and printing the last 3rd element of the array.
        int[] arr = {12,4,6,1,7,99,4,6,33,99,124,79};
        int[] sortedArray = Arrays.stream(arr).sorted().toArray();
        int length = sortedArray.length - 3;
        int element = sortedArray[length];
        System.out.println("The 3rd largest element in an array = "+element);

        //Second approach for doing this is
        for(int i=0;i<arr.length;i++){

       }
    }
}
