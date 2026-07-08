package DSA.LeetCode;

public class DSA_58_08_July {
    //1493. Longest Subarray of 1's After Deleting One Element
    public static void main(String[] args) {
        int[] array = {0,1,1,1,0,1,1,0,1};
        System.out.println("Result = "+longestSubarray(array));
    }
    public static int longestSubarray(int[] array) {
        int low = 0;
        int macCount = 0;
        int zeroCount = 0;
        for(int high = 0;high<array.length;high++){
            if(array[high] == 0){
                zeroCount++;
            }
            while (zeroCount > 1){
                if(array[low] == 0){
                    zeroCount --;
                }
                low++;
            }
            macCount  = Math.max(macCount, high-low);
        }
        return macCount;
    }
}
