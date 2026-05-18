package DSA.LeetCode;

import java.util.Arrays;
import java.util.List;

public class DSA_7_19_April {

    public static void main(String[] args) {


        int[] arr = {3,10,99,5,7,1,98,45};
        int n = arr.length;
        int max = arr[0];
        for(int i=0;i<n;i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }
        System.out.println(max);

        List<Integer> num = Arrays.asList(3,10,99,5,7,1,98,45);
        int max2 = num.stream()
                .mapToInt(i->i.intValue())
                .max()
                .orElse(0);
        System.out.println(max2);

    }

}
