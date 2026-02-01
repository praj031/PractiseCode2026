package InterviewPractice.January2026;

public class BinarySorting {

    static void main(String[] args) {

        int n = 5;
        int arr[] = {2,34,64,86,12,76,78};
        int k = 1;

        Solution obj = new Solution();
        int value = obj.binarysearch(arr, n, k);
        System.out.println(value);
    }

}

class Solution {
    int binarysearch(int arr[], int n, int k) {
        //You can code here
        k = 1;
        for(int i=0;i<arr.length;i++){

            if (k == arr[i]){
                return i;
            }

        }
        return -1;
    }
}
