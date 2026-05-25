package DSA.LeetCode;

public class DSA_37_25_May {
    /*
    209. Minimum Size Subarray Sum
     */

    public static void main(String[] args) {
        int[] arr = {2,3,1,2,4,3};
        int target = 7;
        int minValue = minSubArrayLen(target, arr);
        System.out.println("Minimum size array = "+minValue);
    }
    public static int minSubArrayLen(int k, int[] arr) {
        int n = arr.length;
        int low = 0;
        int high = 0;
        int result = Integer.MAX_VALUE ;
        int sum = 0;
        while(high < n){
            sum = sum + arr[high];
            while(sum >= k){
                int length = high - low + 1;
                result = Math.min(result,length);
                sum = sum - arr[low];
                low ++;
            }
            high++;
        }
        return result;
    }
}
