package DSA;

import java.util.Arrays;

public class DSA_11_22_April {

    //3 sum closet
    public static void main(String[] args) {

        int[] arr = {-1,0,1,2,-1,-4};
        int n = arr.length;
        int[] sortedArray = Arrays.stream(arr).sorted().toArray();
        int target = 9;
        int closest = sortedArray[0] + sortedArray[1] + sortedArray[2];

        for(int i=0;i<n-2;i++) {

            if (i > 0 && sortedArray[i] == sortedArray[i - 1])
                continue;

            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                int sum = sortedArray[i] + sortedArray[left] + sortedArray[right];

                if(Math.abs(target - sum) < Math.abs(target - closest)){
                    closest = sum;
                }

                if (sum == target) {
                    System.out.println("Closest = "+closest);
                    left++;
                    right--;
                }
                else if (sum < target) {
                    left++;
                }
                else {
                    right--;
                }
            }

        }

        System.out.println("Closest = "+closest);

    }

}
