package DSA.LeetCode;

public class DSA_47_27_June {
    //713. Subarray Product Less Than K
    public static void main(String[] args) {
        int[] array = {10,5,2,6};
        int k = 100;
        int result = numSubarrayProductLessThanK(array,k);
        System.out.println("Output = "+result);
    }
    public static int numSubarrayProductLessThanK(int[] array, int k) {
        int n = array.length;
        int low = 0;
        int product = 1;
        int count = 0;
        for(int high = 0; high < array.length; high++){
            product = product * array[high];
            while (product >= k && low<high){
                product = product/array[low];
                low++;
            }
            if(product < k){
                count= count+ (high - low) + 1;
            }
        }
        return count;
    }
}
