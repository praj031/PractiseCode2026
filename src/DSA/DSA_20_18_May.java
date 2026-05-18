package DSA;

public class DSA_20_18_May {
    //Square and sort and array

    public static void main(String[] args) {

        int[] arr = {-4,-1,0,34,11,77,99};
        int length = arr.length;
        int left = 0;
        int right = arr.length - 1;
        int position = length - 1;
        int[] result = new int[length];

        while (left <= right){
            int leftSquare = arr[left] * arr[left];
            int rightSquare = arr[right] * arr[right];

            if(leftSquare > rightSquare){
                result[position] = leftSquare;
                left++;
            }
            else {
                result[position] = rightSquare;
                right--;
            }
            position --;

        }
        for(int i=0;i< result.length;i++){
            System.out.print(result[i] + " ");
        }
    }
}
