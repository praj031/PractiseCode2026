package DSA;

import java.util.Arrays;

public class DSA_2_16_April {

    public static void main(String[] args) {


        int[] arr = {0,0,1,1,0};
        int[] sortedArr = Arrays.stream(arr).sorted().toArray();
        for(int i=0;i<sortedArr.length;i++){
            System.out.print(sortedArr[i]+" ");
        }


    }

}
