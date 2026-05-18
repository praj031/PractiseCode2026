package DSA.LeetCode;

public class DSA_25_18_May {
    //Dutch National Flag
    public static void main(String[] args) {

        int[] arr = {2,0,2,1,1,0};
        int zero = 0;
        int one = 0;
        int two = 0;
        int[] newArr = new int[arr.length];

        for (int k : arr) {
            if (k == 0) {
                zero++;
            }
            if (k == 1) {
                one++;
            }
            if (k == 2) {
                two++;
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
        for(int i=0;i<two;i++){
            newArr[pos] = 2;
            pos++;
        }
        for (int j : newArr) {
            System.out.print(j + " ");
        }

    }
}
