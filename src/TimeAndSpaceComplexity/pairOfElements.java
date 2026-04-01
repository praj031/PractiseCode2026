package TimeAndSpaceComplexity;

public class pairOfElements {

    public static void main(String[] args) {

        int[] arr = {0,1,2,3,4,5,6,7,8,9};
        int n= arr.length;
        int count = 0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                System.out.println(arr[i]+" "+arr[j]);
                count++;
            }
        }
        System.out.println("Count of number = "+count);

    }
}
