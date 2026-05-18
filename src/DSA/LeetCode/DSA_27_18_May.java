package DSA.LeetCode;

import java.util.Arrays;

public class DSA_27_18_May {
    //3sum
    public static void main(String[] args) {

        int[] arr = {-1, 0, 1, 2, -1, -4};
        int[] sortedArray = Arrays.stream(arr).sorted().toArray();
        int sum = 0;
        int target = 0;
        for(int i=0;i<sortedArray.length;i++){
            for(int j=i+1;j<sortedArray.length;j++){
                for(int k=j+1;k<sortedArray.length;k++){
                  sum = sortedArray[i]+sortedArray[j]+sortedArray[k];
                  if(sum == target){
                      System.out.println(sortedArray[i]+" "+sortedArray[j]+" "+sortedArray[k]);
                  }
                }
            }
        }


    }
}
