package DSA;

public class DSA_1_17_April {
    public static void main(String[] args) {

        //Rearrange 0 and 1

        int[] arr = {0, 1, 0, 1, 0, 0, 1, 1, 1, 0};
        int left = 0;
        int right = arr.length - 1;
        while(left < right ){
            if(arr[left] == 1 && arr[right] == 0){
                arr[left] = 0;
                arr[right] = 1;
                left ++;
                right --;
            }
            else if(arr[left] == 0){
                left ++;
            }
            else if(arr[right] == 1){
                right --;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
