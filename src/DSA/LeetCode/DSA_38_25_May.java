package DSA.LeetCode;

public class DSA_38_25_May {

    //First and last occurrence of number in an array

    public static void main(String[] args) {

        int[] arr = {1,2,2,2,3,4};
        int target = 2;
        int n = arr.length;

        for(int i=0;i<n;i++){
            if(arr[i] == target){
                System.out.println("First occurrence = " + i);
                break;
            }
        }
        for(int i=n-1;i>0;i--){
            if(arr[i] == target){
                System.out.println("Last occurrence = " + i);
                break;
            }
        }


    }
}
