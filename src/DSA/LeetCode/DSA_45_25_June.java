package DSA.LeetCode;

public class DSA_45_25_June {

    //Find the max sum of sub array of sie k.
    public static void main(String[] args) {
        int[] array = {100,400,300,200};
        int k = 2;
        int result = maxSumSubArray(array,k);
        System.out.println("Output = "+result);

        int[] array2 = {1,12,-5,-6,50,3};
        int k2 = 4;
        double result2 = findMaxAverage(array2,k2);
        System.out.println("Output = "+result2);
    }

    public static int maxSumSubArray(int[] arr, int k){
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

    public static double findMaxAverage(int[] arr, int k) {
        long sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        long maxSum = sum;
        int low = 0;
        int high = k - 1;
        while (high < arr.length - 1) {
            sum -= arr[low];
            low++;
            high++;
            sum += arr[high];
            maxSum = Math.max(maxSum, sum);
        }
        return (double) maxSum / k;
    }
}


