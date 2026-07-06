package DSA.LeetCode;

public class DSA_53_06_July {
    //Minimum size sub array
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1,1,1,1};
        int k = 11;
        int result = minSubArrayLen(k,arr);
        System.out.println("Output = "+result);
    }

    public static int minSubArrayLen(int k, int[] arr) {

        int low = 0;
        int sum = 0;
        int result = Integer.MAX_VALUE;
        for(int high=0;high < arr.length;high++){
            sum = sum + arr[high];
            while (sum >= k){
                int length = high - low + 1;
                result = Math.min(result,length);
                sum = sum - arr[low];
                low++;
            }
        }
        if( result == Integer.MAX_VALUE){
            return 0;
        }else {
            return result;
        }

    }

}
