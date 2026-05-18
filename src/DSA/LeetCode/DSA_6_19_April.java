package DSA.LeetCode;

public class DSA_6_19_April {

    public static void main(String[] args) {

        int[] arr = {-4,-1,0,3,10};
        int n = arr.length;
        int left = 0;
        int right = n-1;
        int pos = n-1;
        int[] result = new int[n];

        while (left<=right){

            int leftSqr = arr[left] * arr[left];
            int rightSqr = arr[right] * arr[right];

            if(leftSqr > rightSqr){
                result[pos] = leftSqr;
                left++;
            }else {
                result[pos] = rightSqr;
                right --;
            }
            pos--;
        }

        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }


    }

}
