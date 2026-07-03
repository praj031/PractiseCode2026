package DSA.LeetCode;

import java.util.HashMap;

public class DSA_52_03_July {

    public static void main(String[] args) {
        int[] array = {1,5,4,2,9,9,9};
        int k = 3;
        long result = maximumSubarraySum(array,k);
        System.out.println("Output = "+result);
    }
    public static long maximumSubarraySum(int[] arr, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        long sum = 0;
        long result = 0;
        int low = 0;
        int high = k - 1;
        for(int i = 0; i < k; i++) {
            sum += arr[i];
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        if(map.size() == k) {
            result = sum;
        }
        while(high < arr.length - 1) {
            map.put(arr[low], map.get(arr[low]) - 1);
            if(map.get(arr[low]) == 0) {
                map.remove(arr[low]);
            }
            sum -= arr[low];
            low++;
            high++;
            sum += arr[high];
            map.put(arr[high], map.getOrDefault(arr[high], 0) + 1);
            if(map.size() == k) {
                result = Math.max(result, sum);
            }
        }
        return result;
    }
}
