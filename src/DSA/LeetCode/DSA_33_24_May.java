package DSA.LeetCode;

public class DSA_33_24_May {
    //4. First Negative Number in Every Window of Size K
    public static void main(String[] args) {

        int[] arr = {12,-1,-7,8,-15,30,16,28};
        int n = arr.length;
        int k = 3;
        for(int i=0;i<=n-k;i++){
            for(int j=i;j<i+k;j++){
                if(arr[j] < 0){
                    System.out.print(arr[j]+" ");
                    break;
                }
            }
        }
    }
}
