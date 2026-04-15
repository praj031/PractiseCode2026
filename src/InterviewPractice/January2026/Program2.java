package InterviewPractice.January2026;

//import static java.lang.StringTemplate.STR;

public class Program2 {
    //Find the smallest element in an array
    public static void main(String[] args){

        System.out.println("output");

        int[] arr = {34,82,4,623,6421,99};

        smallestElement(arr);
    }

    private static void smallestElement(int[] arr) {

        int smallest = arr[0];

        for(int i=0;i<arr.length;i++){
            if(arr[i]<smallest){
                smallest = arr[i];
            }
        }
        //System.out.println(STR."Smallest element = \{smallest}");
        System.out.println("smallest = "+smallest);


    }
}
