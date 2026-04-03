package InterviewPractice.January2026;

//import static java.lang.StringTemplate.STR;

public class SumOfElements {
    //Calculate sum of all elements
    static void main(String[] args) {

        int[] arr = {12, 54, 77, 23, 66};
        sumOfAll(arr);

    }

    private static void sumOfAll(int[] arr) {
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
        }
        //System.out.println(STR."Sum of all element in array  = \{sum}");
        System.out.println(sum);
    }

}

