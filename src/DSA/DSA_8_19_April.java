package DSA;

public class DSA_8_19_April {

    //Reverse an array
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        int n = arr.length;
        int left = 0;
        int right = n-1;

        while(right > left){

            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;


        }

        for(int k=0;k<n;k++){
            System.out.print(arr[k]+" ");
        }

    }
}
