package DSA.LeetCode;

import java.util.Arrays;

public class DSA_18_14_May {
    //Find the 3rd largest element in the array
    public static void main(String[] args) {
        //General way fo checking the 3rd largest element of the array. -
        //By sorting the array into ascending order and printing the last 3rd element of the array.
        //This will fail in when the elements are duplicate, so we need to add another stream call of distinct
        int[] arr = {12,4,6,1,7,99,4,6,33,99,124,79};
        int[] sortedArray = Arrays.stream(arr).sorted().distinct().toArray();
        for(int m=0;m<sortedArray.length;m++){
            System.out.print(sortedArray[m] + " ");
        }
        int length = sortedArray.length - 3;
        int element = sortedArray[length];
        System.out.println("The 3rd largest element in an array = "+element);

        //Second approach for doing this is
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;
        System.out.println(first + " " + second + " " + third);
        for(int i=0;i<arr.length;i++){
            int num = arr[i];
            if(num > first ){
                third = second;
                second = first;
                first = num;
            } else if (num > second && num != first) {
                third = second;
                second = num;
            }
            else if (num > third && num != second){
                third = num;
            }
        }
        System.out.println("The largest number = "+third);
    }
}
