package InterviewPractice.December;

public class Program2 {

    public static void main(String[] args) {

        //Max value from an array
        int[] arr = {-1, -5, -3};

        findMax(arr);
    }

    public static int findMax(int[] arr) {
        // Write your code here
        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        //System.out.println(max);
        return max;  // Replace with actual implementation
    }

}
