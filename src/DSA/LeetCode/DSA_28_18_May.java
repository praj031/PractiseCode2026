package DSA.LeetCode;

public class DSA_28_18_May {
    //sorting array
    public static void main(String[] args) {
        OnlyZerosAndOnes();
        System.out.println();
        WithoutZerosAndOnes();
    }

    static void WithoutZerosAndOnes() {
        int[] arr = {9,8,7,6,5,4,3,8,6,2,0,1};
        for(int i=0;i< arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] < arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }

    static void OnlyZerosAndOnes(){
        int[] arr = {0,1,1,0,1,0,1,0};
        int zero = 0;
        int one = 0;
        int[] newArr = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            if(arr[i] == 0){
                zero++;
            }
            if(arr[i] == 1){
                one++;
            }
        }
        int pos = 0;
        for(int i=0;i<zero;i++){
            newArr[pos] = 0;
            pos++;
        }
        for(int i=0;i<one;i++){
            newArr[pos] = 1;
            pos++;
        }

        for(int i=0;i< newArr.length;i++){
            System.out.print(newArr[i] + " ");
        }

    }
}
