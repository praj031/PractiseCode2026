package DSA;

public class DSA_4_18_April {

    public static void main(String[] args) {

        int[] arr1 = {1,3,5};
        int[] arr2 = {2,4,6};

        int n = arr1.length + arr2.length;

        int[] result = new int[n];

        int i=0,j=0,pos=0;

        //Main logics
        while(i<arr1.length && j<arr2.length){

            if(arr1[i]<=arr2[j]){
                result[pos] = arr1[i];
                pos++;
                i++;
            }else {
                result[pos] = arr2[j];
                j++;
                pos++;
            }
        }
        //To handle outside the loop
        while(i < arr1.length){
            result[pos] = arr1[i];
            i++;
            pos++;
        }
        while(j < arr2.length){
            result[pos] = arr2[j];
            j++;
            pos++;
        }

        //Output
        for (int k : result) {
            System.out.print(k + " ");
        }



    }

}
