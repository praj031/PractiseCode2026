package DSA.LeetCode;

import java.util.HashMap;
import java.util.Map;

public class DSA_57_08_July {
    //904. Fruit Into Baskets

    public static void main(String[] args) {
        int[] array = {1,2,3,2,2};
        int output = totalFruit(array);
        System.out.println("Output = "+output);
    }
    public static int totalFruit(int[] fruits) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int low = 0;
        int max = 0;
        int k = 2;
        for(int high = 0;high<fruits.length;high++){
            int i = fruits[high];
            map.put(i,map.getOrDefault(i,0)+1); //This loads the freq in the memory
            while (map.size() > k){
                int lefValue = fruits[low];
                map.put(lefValue, map.get(lefValue) - 1);//This reduces the frequency
                if(map.get(lefValue) == 0){
                    map.remove(lefValue);
                }
                low++;
            }
            max = Math.max(max , high-low+1);
        }
       return max;
    }
}
