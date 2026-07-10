package DSA.LeetCode;

public class DSA_59_10_July {
    //Longest
    public static void main(String[] args) {
        int[] array = {1,1,1,0,0,0,1,1,1,1,0,};
        int zeroAllowed = 2;
        int maxLength = longestOnes(array,zeroAllowed);
        System.out.println("Max Length = "+maxLength);
    }
    public static int longestOnes(int[] nums, int k) {
        int low = 0;
        int maxLength = 0;
        int zeroCount = 0;
        for(int high = 0; high < nums.length; high ++){
            if(nums[high] == 0){
                zeroCount++;
            }
            while (zeroCount > k){
                if(nums[low] == 0){
                    zeroCount --;
                }
                low ++;
            }
            maxLength = Math.max(maxLength, high - low + 1);
        }
        return maxLength;
    }//
}
