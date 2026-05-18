package DSA.LeetCode;

import java.util.Arrays;

public class DSA_21_18_May {
    //Square and sort the array
    public static void main(String[] args) {
        int[] arr = {-4,-1,0,34,11,77,99};

        int[] result = Arrays.stream(arr)
                .map(s -> s*s)
                .sorted()
                .toArray();
        for (int i=0;i< result.length;i++){
            System.out.print(result[i] + " ");
        }
    }
}
