package InterviewPractice.January2026;

import java.sql.Array;

public class Program1 {
    //Find the largest element in an array

    public static void main(String[] args) {

        int[] arr = {12, 14, 33, 99, 90, 44, 101, 55};
        findLargestNumber(arr);

        int x=10;
        double y=2.3;
        System.out.println(x/y);


    }

    private static void findLargestNumber(int[] arr) {

        int largest = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }
        System.out.println("Largest = "+largest);

    }

}
