package Java8features.StreamAPIQuestions;

import java.util.Arrays;
import java.util.List;

public class PrintSecondLargestNumber {

    public static void main(String[] args) {
        usingLambda();
        withoutLambda();
    }
    //This is the good approach
    static void usingLambda(){
        List<Integer> numbers = Arrays.asList(4, 2, 8,2,5,4,1, 6, 10,6,8,4);
        List<Integer> sortedArray = numbers.stream()
                .distinct()
                .sorted()
                .toList();
        //System.out.println(sortedArray);
        int index = sortedArray.size() - 2;
        System.out.println("The value of second largest number in the array list : "+sortedArray.get(index));


    }

    static void withoutLambda(){
        int[] arr = {4, 2, 8, 2, 5, 4, 1, 6, 10, 6, 8, 4};
        int largest = 0;
        int first , last ;
        for(int i=0;i<arr.length-1;i++){

            if(arr[i]>arr[i+1]){
                largest = arr[i];
            }
        }
        System.out.println("The largest number is = "+largest);
    }

}
