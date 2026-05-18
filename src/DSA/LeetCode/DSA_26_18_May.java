package DSA.LeetCode;

import java.util.Arrays;

public class DSA_26_18_May {

    // Three Sum Problem
    public static void main(String[] args) {

        int[] arr = {-1, 0, 1, 2, -1, -4};

        int[] sortedArr = Arrays.stream(arr)
                .sorted()
                .toArray();

        int n = sortedArr.length;
        int target = 0;

        for (int i = 0; i < n - 2; i++) {
            if (i > 0 && sortedArr[i] == sortedArr[i - 1]) {
                continue;
            }
            int left = i + 1;
            int right = n - 1;
            while (left < right) {
                int sum = sortedArr[i] + sortedArr[left] + sortedArr[right];
                if (sum == target) {
                    System.out.println(sortedArr[i] + " " + sortedArr[left] + " " + sortedArr[right]);
                    left++;
                    right--;

                    while (left < right && sortedArr[left] == sortedArr[left - 1]) {
                        left++;
                    }

                    while (left < right && sortedArr[right] == sortedArr[right + 1]) {
                        right--;
                    }

                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }
    }
}