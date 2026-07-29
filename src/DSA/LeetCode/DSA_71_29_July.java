package DSA.LeetCode;

import java.util.Arrays;

public class DSA_71_29_July {

    public static void main(String[] args) {
        //remove duplicate
        int[] arr = {2,2,2,3,4,2,6,9,10,11};
        int[] sorted = Arrays.stream(arr).sorted().toArray();
        int low = 0;
        int high = 1;
        while (high<sorted.length){

            if(sorted[low] != sorted[high] ){

                low++;
                sorted[low] = sorted[high];

            }
            high++;
        }

        for(int i =0;i<=low;i++){
            System.out.println(sorted[i]);
        }

    }
}
