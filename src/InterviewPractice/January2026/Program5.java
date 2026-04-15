package InterviewPractice.January2026;

public class Program5 {
    //Just using the new and old for loop
    static void main(String[] args) {

        int sum1 = 0;
        int sum2 = 0;

        int arr[] = {10,23,43,64,65,23};
        for (int i : arr){
            sum1 = sum1 + i;
        }
        System.out.println("Sum from the new array = "+sum1);

        for(int i=0;i<arr.length;i++){
            sum2 = sum2 + arr[i];
        }
        System.out.println("Sum from the old for loop = "+sum2);

    }

}
