package DSA;

import java.util.Arrays;

public class DSA_16_24_April {

    public static void main(String[] args) {

        optimisedWay();
        System.out.println(" ");
        bruteForceMethod();


    }

    private static void bruteForceMethod() {
        int[] arr = {5, 1, 3, 4, 7};
        int target = 12;
        int n = arr.length;
        int[] sortedArray = Arrays.stream(arr).sorted().toArray();
        int sum, count =0;

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){

                    sum = sortedArray[i]+sortedArray[j]+sortedArray[k];

                    if(sum < target){
                        System.out.print(sortedArray[i]+","+sortedArray[j]+","+sortedArray[k]+"    ");

                        count ++;
                    }

                }
            }
        }
        System.out.println();
        System.out.println("Count of close triplets via brute force  = "+count);


    }

    static void optimisedWay(){
        int[] arr = {5, 1, 3, 4, 7};
        int target = 12;
        int n = arr.length;
        int count = 0;
        int[] sortedArray = Arrays.stream(arr).sorted().toArray();

        System.out.print("3 value pairs = ");
        for(int i=0;i<n-2;i++) {
            int left = i + 1;
            int right = n - 1;
            while (left < right) {
                int sum = sortedArray[i] + sortedArray[left] + sortedArray[right];
                if(sum >= target){
                    right --;
                }else {  //sum < target
                    count = count + (right - left);
                    left++;
                }
            }
        }

        System.out.println("Count in case of optimised method = "+count);

    }


}
