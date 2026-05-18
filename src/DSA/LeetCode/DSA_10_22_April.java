package DSA.LeetCode;

public class DSA_10_22_April {
    public static void main(String[] args) {

        //No duplicate of 2 some

        int[] arr = {1,1,1,1,2,2,2,3,3,3,4,4};
        int n = arr.length;
        int left = 0;
        int right = n - 1;
        int target = 5;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == target) {
                System.out.println(arr[left] + " " + arr[right]);

                left++;
                right--;

                // Skip duplicates on left
                while (left < right && arr[left] == arr[left - 1]) {
                    left++;
                }

                // Skip duplicates on right
                while (left < right && arr[right] == arr[right + 1]) {
                    right--;
                }
            }
            else if (sum < target) {
                left++;
            }
            else {
                right--;
            }
        }
    }
}