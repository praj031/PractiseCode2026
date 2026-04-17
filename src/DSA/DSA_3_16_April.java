package DSA;

public class DSA_3_16_April {

    public static void main(String[] args) {


        // Sort the number is ascending order.

        int[] arr = {5,2,8,7,1};
        int length = arr.length;
        int temp = 0;

        for(int i=0;i<length;i++){
            for(int j=i+1;j<length;j++){
                if(arr[j]<arr[i]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int i=0;i<length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
