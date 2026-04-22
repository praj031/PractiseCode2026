package DSA;

public class DSA_12_22_April {

    public static void main(String[] args) {

        String[] string = {"H","a","n","n","a","h"};
        int n = string.length;

        int left = 0;
        int right = n-1;
        String temp;
        while (left<right){

            temp = string[left];
            string[left] = string[right];
            string[right] = temp;

            left++;
            right--;
        }
        for (int i=0;i<n;i++){
            System.out.print(string[i]+" ");
        }


    }
}
