package HashMap;

public class CountUniqueNumber {

    public static void main(String[] args) {

        int[] arr = {3,4,3,6,6};

        int uniqueFlag = 0;

        for(int i=0;i< arr.length;i++){
            int count = 0;

            //Count how many times same number appear in an array
            for(int j=0;j< arr.length;j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }


            if(count==1){
                System.out.println(arr[i]);
                uniqueFlag++;
            }

        }
        //System.out.println(uniqueFlag);

    }


}
