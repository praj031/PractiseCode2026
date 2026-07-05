package DSA.LeetCode;

public class DSA_48_02_July {
    //Maximum Subarray
    public static void main(String[] args) {
        int[] arr = {2,5,1,7,4,7};
        int result = maxSubArray(arr);
        System.out.println(
                "Result = "+ result
        );
    }
    public static int maxSubArray(int[] arr) {

        int n = arr.length;
        int low = 0;
        int result = Integer.MIN_VALUE;
        int sum = 0;
        for(int high = 0;high < n;high++){
            sum = sum + arr[high];
            while (high <= n){
                result = Math.max(result,sum);
                sum = sum - arr[low];
                low++;
                sum = sum + arr[high];
            }
        }
        System.out.println(result);
        return result;
    }
}
//