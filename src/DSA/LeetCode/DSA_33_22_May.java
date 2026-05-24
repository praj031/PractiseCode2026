package DSA.LeetCode;

public class DSA_33_22_May {
    //3. Average of Every Window of Size K
    public static void main(String[] args) {

        int[] arr = {1,3,2,6,-1,4,1,8,2};
        int k = 5;
        int n = arr.length;
        int sum = 0;
        int low = 0;
        int high = k;
        for(int i=0;i<k;i++){
            sum = sum + arr[i];
        }
        while (high < n){
            double avg = (double) sum / k;
            System.out.print(avg+ " ");
            if (high == n) {
                break;
            }
            // Remove left element
            sum = sum - arr[low];
            low++;
            // Add next element
            sum = sum + arr[high];
            high++;
        }


    }
}
