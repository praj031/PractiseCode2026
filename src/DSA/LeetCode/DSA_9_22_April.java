package DSA.LeetCode;

import java.util.Arrays;

public class DSA_9_22_April {

    //Three sum questions
    public static void main(String[] args) {

        bruteForce(); // Not optimise solutions but gives the duplicate output
        optimisedWay();
    }

    static void optimisedWay() {

        int[] arr = {-1,0,1,2,-1,-4};
        int n = arr.length;
        int[] sortedArray = Arrays.stream(arr).sorted().toArray();
        int target = 0;

        System.out.print("3 value pairs = ");
        for(int i=0;i<n-2;i++) {

            if (i > 0 && sortedArray[i] == sortedArray[i - 1])
                continue;

            int left = i + 1;
            int right = n - 1;
            //int sum = -1 * sortedArray[i];

            while (left < right) {
               int sum = sortedArray[i] + sortedArray[left] + sortedArray[right];

                if (sum == target) {
                    System.out.print(sortedArray[i] +" "+sortedArray[left] + " " + sortedArray[right]+"             ");
                    left++;
                    right--;

                    // Skip duplicates on left
                    while (sortedArray[left] == sortedArray[left - 1]) {
                        left++;
                    }

                    // Skip duplicates on right
                    while (sortedArray[right] == sortedArray[right + 1]) {
                        right--;
                    }
                }
                else if (sum < target) {
                    left++;
                }
                else {
                    right--;
                }
            }

        }

    }

    static void bruteForce(){
        int[] arr = {-1,0,1,2,-1,-4};
        int n = arr.length;
        int[] sortedArray = Arrays.stream(arr).sorted().toArray();
        int sum = 0;

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){

                    sum = sortedArray[i]+sortedArray[j]+sortedArray[k];

                    if(sum == 0){
                        System.out.println("Values = "+sortedArray[i]+" "+sortedArray[j]+" "+sortedArray[k]);
                    }

                }
            }
        }

    }

}
