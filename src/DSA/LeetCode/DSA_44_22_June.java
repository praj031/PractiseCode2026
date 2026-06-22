package DSA.LeetCode;

public class DSA_44_22_June {
    //Find the first and last occurrence if the element in an array.
    public static void main(String[] args) {
        int[] arr = {0,3,2,4,4,2,1,2,2,5,6};
        int target = 2;
        int n = arr.length;
        int low = 0;
        int high = n-1;
        while(low<high){
            boolean find = false;
            if(arr[low] == target){
                System.out.println("Initial Index = "+low);
                find = true;
            }
            if(arr[high] == target){
                System.out.println("Final Index = "+high);
                find = true;
            }
            low++;
            high--;

            if(find){
                break;
            }
        }

    }
}
