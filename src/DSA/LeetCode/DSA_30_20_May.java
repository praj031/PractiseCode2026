package DSA.LeetCode;

public class DSA_30_20_May {
    //You are given an array nums. Your task is to find out the sum of the maximum and minimum elements in the array.
    public static void main(String[] args) {

        int[] arr = {-10, 2, 4, 5, 6};
        int minValue = minElement(arr);
        int maxValue = maxElement(arr);
        System.out.println(minValue + " " + maxValue);
        int sum = maxValue + minValue;
        System.out.println("Sum b/w min and max = "+sum);

    }

     static int maxElement(int[] arr) {
         int max = 0;
         for(int i=0;i<arr.length;i++){
             if(max > arr[i]){
                 max = arr[i];
             }
         }
         return max;
    }

    static int minElement(int[] arr){
        int min = 0;
        for(int i=0;i<arr.length;i++){
            if(min < arr[i]){
                min = arr[i];
            }
        }
        return min;
    }


}
