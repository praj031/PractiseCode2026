package DSA.LeetCode;

import java.util.Arrays;

public class DSA_17_07_May {
    public static void main(String[] args) {

        int[] nums = {10,5,2,6};
        int product = 100;
        int count = 0;
        int n = nums.length;
        int finalProduct ;
        int[] sortedArray = Arrays.stream(nums).sorted().toArray();  // 2,6,5,10

        for(int i=0;i<n;i++){
            int left = i+1;
            int right = n-1;

            while (left<right){

                finalProduct = sortedArray[i] * sortedArray[left] * sortedArray[right];

                if(product >= finalProduct){
                    right--;
                }else {
                    count = count + (right - left);
                    left++;
                }
            }

        }
        System.out.println(count);

    }
}
