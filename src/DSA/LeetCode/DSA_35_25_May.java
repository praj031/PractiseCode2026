package DSA.LeetCode;

public class DSA_35_25_May {
    
    //Sliding window when the target is not given to us, I mean K value is not given
    //Question is to find the minimum length of sub array which is >= target

    public static void main(String[] args) {
        
        int[] arr = {1,2,4,4};
        int n = arr.length;
        int target = 4;
        int low = 0; 
        int high = 0;
        int result = 0;
        int length;
        int sum = 0;
        while (high < n){ //The whole iteration will happen here
            sum = sum + arr[high];  //To add the element
            while (sum >= target){  //To check if the sum >= target as per asked in logic
                length = high - low + 1;  //To get the length of window, in the current loop
                result = Math.min(result, length);;  //Get the max of result
                sum = sum - arr[low];  //To remove the previous of the element
                low++; //To change index of low point so that windows goes to new point
            }
            high ++; //Increasing the window to one place as well
        }
        System.out.println("Minimum length of sub array = "+result);
    }
}
