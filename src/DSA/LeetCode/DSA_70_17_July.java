package DSA.LeetCode;

import java.util.HashMap;

public class DSA_70_17_July {
   // 219. Contains Duplicate II
   public static void main(String[] args) {
       int[] arr = {1,2,3,1,2,3};
       int k = 2;
       boolean output = containsNearbyDuplicate(arr,k);
       System.out.println("Output = "+output);
       boolean output1 = containsApproach2(arr,k);
       System.out.println("Output = "+output1);
   }
    public static  boolean containsNearbyDuplicate(int[] arr, int k) {

       for(int low = 0;low < arr.length; low++){
           for(int high = low+1; high < arr.length;high++){
               if(arr[low] == arr[high] && (high - low <= k)){
                   return true;
               }
           }
       }
       return false;
    }

    public static boolean containsApproach2(int[]nums,int k){
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                int previousIndex = map.get(nums[i]);
                if (i - previousIndex <= k) {
                    return true;
                }
            }
            map.put(nums[i], i);
        }
        return false;
    }
}
/*


Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.
Example 1:
Input: nums = [1,2,3,1], k = 3
Output: true
Example 2:

Input: nums = [1,0,1,1], k = 1
Output: true
Example 3:

Input: nums = [1,2,3,1,2,3], k = 2
Output: false */