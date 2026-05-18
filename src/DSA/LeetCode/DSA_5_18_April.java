package DSA.LeetCode;

public class DSA_5_18_April {

    public static void main(String[] args) {

        int[] num1 = {1,2,3,0,0,0};
        int[] num2 = {2,5,6};


        int m = 3;
        int n = 3;

        int length = m+n;
        int[] result = new int[length];

        int i=0,j=0,pos=0;

        while(i<m && j<n){
            if(num1[i] <= num2[j]){
                result[pos++] = num1[i++];
            } else {
                result[pos++] = num2[j++];
            }
        }

        while(i < m){
            result[pos++] = num1[i++];
        }

        while(j < n){
            result[pos++] = num2[j++];
        }

        for(int k = 0; k < length; k++){
            num1[k] = result[k];
        }

        //Output
        for (int k : result) {
            System.out.print(k + " ");
        }

    }

}
