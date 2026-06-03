package DSA.LeetCode;

public class DSA_41_03_June {
    //arr1 = {1,2,3} && arr2 = {4,5};
    //Find sum of each element

    public static void main(String[] args) {

        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5,6};
        int sum =0;
        int length1 = arr1.length;
        int length2 = arr2.length;
        int minLength = Math.min(length2,length1);
        for(int i=0;i<minLength;i++){
            sum = arr1[i] + arr2[i];
            System.out.println(sum);
        }



    }


}
