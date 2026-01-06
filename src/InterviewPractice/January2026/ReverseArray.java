package InterviewPractice.January2026;

public class ReverseArray {
    //Reverse array without extra space
    static void main(String[] args) {
        int[] arr = {12,34,56,22,55,67,23,54,55};
        reverseOfArray(arr);
        for (int num : arr) {
            System.out.print(STR."\{num} ");
        }
        System.out.println();
    }

    private static void reverseOfArray(int[] arr) {

        int start = 0;
        int end = arr.length-1;

        while (start<end){
            int temp = arr[start];
            arr[start]= arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

}
