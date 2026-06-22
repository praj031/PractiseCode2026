package DSA.LeetCode;

public class DSA_44_22_June {
    //Find the first and last occurrence if the element in an array.
    public static void main(String[] args) {
        int[] arr = {0,3,2,4,4,2,1,2,2,5,6};
        int target = 2;
        int n = arr.length;
        int low = 0;
        int high = n-1;
        int first = -1;
        int last = -1;
        while (low <= high && (first == -1 || last == -1)) {

            if (first == -1 && arr[low] == target) {
                first = low;
            }
            if (last == -1 && arr[high] == target) {
                last = high;
            }
            if (first == -1) {
                low++;
            }
            if (last == -1) {
                high--;
            }
        }

        System.out.println(first);
        System.out.println(last);

    }
}
