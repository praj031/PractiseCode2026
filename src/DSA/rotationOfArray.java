package DSA;

public class rotationOfArray {

    public static void main(String[] args) {
        leftRotation();
        System.out.println();
        rightRotation();
    }


    static void leftRotation(){
        int[] arr = {1,2,3,4,5};
        int rotation = 2;
        int size = arr.length;
        for(int i=1;i<=rotation;i++){
            int temp = arr[0];  //Set the temp variable as first element of the array
            for(int j=0;j<size-1;j++){
                arr[j] = arr[j+1];  //re-arrange the array
            }
            arr[size-1] = temp; //Set the last element as the first element
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    static void rightRotation(){
        int[] arr = {1,2,3,4,5};
        int rotation = 2;
        int size = arr.length;
        for(int i=1;i<=rotation;i++){
            int temp = arr[size-1];  //Set the temp variable as last element of the array
            for(int j=size-1;j>0;j--){
                arr[j] = arr[j-1];  //re-arrange the array
            }
            arr[0] = temp; //Set the first element as the last element
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

}
