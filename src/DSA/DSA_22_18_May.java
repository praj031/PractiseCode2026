package DSA;

import java.util.Arrays;

public class DSA_22_18_May {
    //2 Sum problem
    public static void main(String[] args) {

        int[] arr = {2,4,3,6,1,8};
        int[] sortedArray = Arrays.stream(arr).sorted().toArray();
        int target = 7;
        int left = 0;
        int right = arr.length - 1;
        int sum = 0;

        while (left < right){
            sum = sortedArray[left] +  sortedArray[right];
            if(sum == target){
                System.out.print(sortedArray[left] + " " + sortedArray[right]);
                break;
            }else if(sum > target){
                right --;
            } else {
                left ++;
            }

        }

    }
}
