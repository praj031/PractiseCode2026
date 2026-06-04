package DSA.LeetCode;

public class DSA_43_03_June {

    //27. Remove Element
    public static void main(String[] args) {

        int[] arr = {0,1,2,2,3,0,4,2};
        int val = 2;
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != val) {
                arr[index] = arr[i];
                index++;
            }
        }
        System.out.println("Length after removing = " + index);
        System.out.print("Array: ");
        for (int i = 0; i < index; i++) {
            System.out.print(arr[i] + " ");
        }

    }

}
/*
    for(int i=0;i<arr.length;i++){
            if(arr[i] != val){
                arr[index] = arr[i];
                index++;
            }
        }
        for (int i=0;i<index;i++){
            System.out.print(arr[index]+" ");
        }

        System.out.println();
        System.out.println("Final index = "+index);
 */