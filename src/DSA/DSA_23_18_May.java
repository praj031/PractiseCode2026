package DSA;

public class DSA_23_18_May {
    //merge 2 sorted array
    public static void main(String[] args) {

        //nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
        int[] arr1 = {1,2,3,0,0,0};
        int[] arr2 = {2,5,6};

        int m = 3, n = 3;

        int newArrSize = m+n;
        int[] finalArray = new int[newArrSize];
        int pos = 0;

        int left = 0;
        int right = 0;
        while (left < m && right < n){
            if(arr1[left] < arr2[right]){
                finalArray[pos] = arr1[left];
                left++;
            }else {
                finalArray[pos] = arr2[right];
                right++;
            }
            pos++;
        }

        while (left < m){
            finalArray[pos] = arr1[left];
            left++;
            pos++;
        }
        while (right < n){
            finalArray[pos] = arr2[right];
            right++;
            pos++;
        }

        for(int i=0;i<newArrSize;i++){
            System.out.print(finalArray[i]+ " ");
        }

    }
}
