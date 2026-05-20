package DSA.LeetCode;

import java.util.Arrays;

public class DSA_31_21_May {
    //Check whether an array arr[] of size N is sorted in non-decreasing order.
    public static void main(String[] args) {

        int[] arr = {10, 20, 40, 25};
        int[] sortedArr = Arrays.stream(arr).sorted().toArray();
        boolean result = Arrays.equals(arr,sortedArr);
        System.out.println(result);

    }
}
