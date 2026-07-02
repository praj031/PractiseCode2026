package DSA.LeetCode;

public class DSA_49_02_July {

    //643. Maximum Average Subarray I
    public static void main(String[] args) {
        int[] arr = {1,12,-5,-6,50,3};
        int k = 4;
        double result = (long) findMaxAverage(arr,k);
        System.out.println("Result = "+result);
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
