package DSA.LeetCode;

import java.util.Arrays;

public class DSA_69_17_July {

    //217. Contains Duplicate
    public static void main(String[] args) {
        int[] arr = {1,2,3,1};
        boolean value1 = containsDuplicateApproch1(arr);
        System.out.println("Output = "+value1);
        boolean value2 = containsDuplicateApproach2(arr);
        System.out.println("Output = "+value2);
    }

    private static boolean containsDuplicateApproach2(int[] arr) {
        int[] sorted = Arrays.stream(arr).sorted().toArray();
        int low =0;
        int high = 1;
        while (high < arr.length){
            if(sorted[low] == sorted[high]){
                return true;
            }
            low++;
            high++;
        }
        return false;
    }

    public static boolean containsDuplicateApproch1(int[] nums) {
        int n = nums.length;
        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++) {
                if(nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;
    }


}
