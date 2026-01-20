package InterviewPractice.January2026;

public class MinNumber {
    static void main(String[] args) {

        int arr[] = {34,66,23,90,11,58,34,74,76};
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++)
        {
            if (arr[i]< min){
                min = arr[i];
            }
            if (arr[i]> max){
                max = arr[i];
            }
        }
        System.out.println(min);
        System.out.println(max);

    }
}
