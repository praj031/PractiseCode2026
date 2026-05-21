package DSA.LeetCode;


import static java.lang.Math.max;

public class DSA_32_21_May {
    //Sliding window -- Find maximum sum of any subarray of size k.
    public static void main(String[] args) {

        int[] arr = {100,200,300,400};
        int k = 2; //Tells the number of pair u need to take
        int n = arr.length;
        int low = 0;
        int high = 1;
        int sum = 0;
        for(int i=0;i<k;i++){ //This will take the sum out of k-th pairs
            sum += arr[i];
        }
        int result = sum;
        while(high < n){

            result = max(result,sum);
            low++;
            high++;
            sum = sum - arr[low -1];
            if(high == n) {
                break;
            }
            sum = sum + arr[high];

        }

        System.out.println("Max sum = "+result);


    }
}
