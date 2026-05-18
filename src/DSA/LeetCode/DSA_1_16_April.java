package DSA.LeetCode;

import java.util.Arrays;

public class DSA_1_16_April {


    public static void main(String[] args) {


        // Given a array and target, now try finding the sum of 2 number that is equals to the target
        //bruteForce();
        System.out.println(" ");
        OptimisedWay();
        OptimisedWay2();


    }


    static void bruteForce(){

        int[] arr = {7,11,2,15};
        int target = 9;
        int result;

        for(int i=0;i<arr.length;i++){
            result = target-arr[i];
            for(int j=i+1;j< arr.length;j++){
                if(arr[j] == result){
                    System.out.println("Sume of these 2 numbers = "+arr[i]+" "+arr[j]);
                    System.out.println("Index of these 2 number = "+i+" "+j);
                }
            }
        }
    }

    static void OptimisedWay(){

        int[] arr = {7,11,2,15};
        int target = 9;

        int[] sortedArray = Arrays.stream(arr).sorted().toArray();

        int i = 0;
        int j = sortedArray.length-1;

        while (i<j){

            int sum = sortedArray[i]+sortedArray[j];
            if(sum == target){
                System.out.println("Sume of these 2 numbers = "+sortedArray[i]+" "+sortedArray[j]);
                System.out.println(i + " " + j);
                break;
            }
            else if(sum > target){
                j--;
            }
            else if (sum < target){
                i++;
            }
            else {
                System.out.println("No sum exit");
            }


        }


    }

    static void OptimisedWay2(){

        int[] arr = {7,11,3,2};
        int target = 9;
        int i = 0;
        int j = arr.length-1;
        while (i<j){
            int sum = arr[i]+arr[j];
            if(sum == target){
                System.out.println("Index of 2 numbers are = "+i + " " + j);
                break;
            }
            else if(sum > target){
                j--;
            }
            else if (sum < target){
                i++;
            }
        }
    }


}
