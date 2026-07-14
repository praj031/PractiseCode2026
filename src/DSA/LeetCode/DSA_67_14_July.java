package DSA.LeetCode;

public class DSA_67_14_July {
    //27. Remove Element

    public static void main(String[] args) {
        int[] arr = {3,2,2,3};
        int target = 3;
        int index = removeElement(arr,target);
        System.out.println(index);
    }
    public static int removeElement(int[] arr, int val) {
        int index = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] != val){
                arr[index] = arr[i];
                index++;
            }
        }
        return index;
    }

}
