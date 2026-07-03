package DSA.LeetCode;

public class DSA_51_03_July {
    //1343. Number of Sub-arrays of Size K and Average Greater than or Equal to Threshold
    public static void main(String[] args) {
        int[] array = {2,2,2,2,5,5,5,8};
        int k = 3;
        int threshold = 4;
        int count = numOfSubarrays(array,k,threshold);
        System.out.println("Output = "+count);
    }
    public static int numOfSubarrays(int[] arr, int k, int threshold) {

        int n = arr.length;
        int count = 0;
        int low = 0;
        int high = k - 1;
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        while (true) {
            if (sum / k >= threshold) {
                count++;
            }
            if (high == n - 1) {
                break;
            }
            sum -= arr[low];
            low++;
            high++;
            sum += arr[high];
        }
        return count;
    }
}
