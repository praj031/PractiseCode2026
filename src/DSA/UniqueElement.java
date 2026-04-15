package DSA;

import java.util.HashSet;
import java.util.Set;

public class UniqueElement {

    static void main(String[] args) {

        int[] arr = {
                10, 5, 0, 10, 11, 3, 2, 4, 4, 0, 0, 10, 1, 4, 6, 1, 9, 9, 7,
                0, 10, 9, 9, 1, 10, 2, 5, 10, 2, 3, 6, 3, 3, 0, 10, 5,
                11, 11, 5, 4, 0, 6, 8, 9, 11, 1, 10, 0, 3, 8, 8, 10,
                3, 6, 0, 7, 3, 9, 7
        };
        int length = 58;
        int count = distinct(arr,length);
        System.out.println(count);
        int countFromSets = distinctSetsCheck(arr,length);
        System.out.println(countFromSets);

    }

    //Good approach
    public static int distinct(int[] arr, int len)
    {
        //You can code here
        int distinctCount=0;
        for (int i = 0; i < len; i++) {

            boolean isDuplicate = false;

            // Check if arr[i] appeared before
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                distinctCount++;
            }
        }
        return distinctCount;
    }

    //Best Approach
    public static Integer distinctSetsCheck(int[] arr, int len) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        return set.size();
    }
}
/*
arr[] = {10, 20, 20, 10, 30, 10}

Output:

3

Explanation: There are three distinct elements 10, 20, and 30.
 */
