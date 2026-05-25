package DSA.LeetCode;

public class DSA_36_25_May {
    //Find the maximum sum of array of size K
    public static void main(String[] args) {
        int[] arr = {100,200,300,400};
        int k = 2;
        int maxValue = maxSubarraySum(arr,k);
        System.out.println("Maximum value = "+maxValue);

    }
    public static int maxSubarraySum(int[] arr, int k) {
        // Code here
        int n = arr.length;
        int low = 0;
        int high = k-1;
        int sum = 0;
        int result = 0;
        for(int i=0;i<k;i++){
            sum = sum + arr[i];
        }

        while(high < n){

            result = Math.max(result,sum);
            low ++;
            high ++;
            sum = sum - arr[low-1];
            if(high == n){
                break;
            }
            sum = sum + arr[high];
        }

        return result;
    }
}
