package DSA.LeetCode;

public class DSA_46_26_June {

    //Minimum size subarray sum --> minimum length of subarray whose sum >= target

    public static void main(String[] args) {

        int[] arr = {1,1,1,1,1,1,1,1};
        int k = 11;
        int output = minSubArrayLen(k,arr);
        System.out.println("Output = "+output);
    }

    public static int minSubArrayLen(int k, int[] arr) {

        int n = arr.length;
        int low = 0;
        int high = 0;
        int result = Integer.MAX_VALUE;
        int sum = 0;
        while(high < n){
            sum = sum + arr[high];
            while (sum >= k){
                int length = high - low + 1;
                result = Math.min(result,length);
                sum = sum - arr[low];
                low++;
            }
            high++;
        }
        if(result == Integer.MAX_VALUE){
            return 0;
        }else {
            return result;
        }
    }
}
