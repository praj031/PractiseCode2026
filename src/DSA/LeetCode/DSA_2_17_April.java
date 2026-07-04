package DSA.LeetCode;

public class DSA_2_17_April {
    public static void main(String[] args) {
        //Remove duplicate
        twoSumMethod();
    }
    static void twoSumMethod(){
        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        int i=0;
        int j=1;
        while (j<arr.length){
            if(arr[j] != arr[i]){
                i++;
                arr[i] = arr[j];
            }
            j++;
        }
        for(int l=0;l< arr.length;l++){
            System.out.print(arr[l]+" ");
        }
//2 sum OP


    }
}
