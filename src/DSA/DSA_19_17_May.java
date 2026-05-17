package DSA;

import java.util.Arrays;

public class DSA_19_17_May {
    //Dutch National Flags -- it's like basic sorting
    public static void main(String[] args) {
        usingStream();
        System.out.println();
        usingTwoPointers();
        System.out.println();
        usingBruteForce();
        System.out.println();
        anotherApproach();
    }

    static void usingStream(){
        int[] arr = {1,0,0,2,1,0,2};
        int[] sortedArray = Arrays.stream(arr).sorted().toArray();
        for (int j : sortedArray) {
            System.out.print(j+" ");
        }
    }

    static void usingBruteForce(){
        int[] arr = {1,0,0,2,1,0,2};
        int zero = 0;
        int one = 0;
        int two = 0;
        int length = arr.length;
        int[] newArr = new int[length];

        for(int i=0;i<length;i++){
            if(arr[i] == 0){
                zero++;
            }
            else if(arr[i] == 1){
                one++;
            }
            else if(arr[i] == 2){
                two++;
            }
        }

        int index = 0;
        for(int i=0;i<zero;i++){
            newArr[index] = 0;
            index++;
        }
        for(int i=0;i<one;i++){
            newArr[index] = 1;
            index++;
        }
        for(int i=0;i<two;i++){
            newArr[index] = 2;
            index++;
        }

        for(int i=0;i<length;i++){
            System.out.print(newArr[i] + " ");
        }

    }

    static void usingTwoPointers(){
        int[] arr = {2,0,1};
        int length = arr.length-1;
        int low = 0;
        int mid = 0;
        int high = length;

        while(mid <= high){
            if(arr[mid] == 0){
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            }
            else if(arr[mid] == 1){
                mid ++;
            }
            else if(arr[mid] == 2){
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high --;
            }
        }
        for(int i=0;i<length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    static void anotherApproach(){
        int[] arr = {2,0,1};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
