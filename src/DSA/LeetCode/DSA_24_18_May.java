package DSA.LeetCode;

import java.util.Arrays;

public class DSA_24_18_May {
    //Remove duplicates from array
    public static void main(String[] args) {
        int[] arr = {1,1,3,2,1,2,3,5,3,9};
        int[] sortedArray = Arrays.stream(arr).sorted().toArray();

        int left = 0;
        int right = 1;

        while (right < sortedArray.length){

            if(sortedArray[left] != sortedArray[right]){
                left ++;
                sortedArray[left] = sortedArray[right];
            }
            right++;
        }
        for(int i=0;i<=left;i++){
            System.out.print(sortedArray[i]+ " ");
        }
    }
}
