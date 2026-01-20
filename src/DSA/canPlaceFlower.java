package DSA;

public class canPlaceFlower {

    static void main(String[] args) {

        int[] arr = {1,0,0,0,1};
        int n = 1;
        boolean value = canPlaceFlowers(arr,n);
        System.out.println(value);
    }

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        //You can code here
        for(int i=0;i< flowerbed.length; i++){
            int left = (i==0) ? 0 : flowerbed[i]-1;
            int right = (i == flowerbed.length-1) ? 0 : flowerbed[i]+1;

            if(flowerbed[i] == 0 && left == 0 && right == 0){
                flowerbed[i] = 1;
                n--;
                if(n==0){
                    return true;
                }
            }
        }
        return n<=0;
    }

    public boolean canPlaceFlowers1(int[] flowerbed, int n) {
        for (int i = 0; i < flowerbed.length; i++) {
            // Check if we can plant at position i
            int left = (i == 0) ? 0 : flowerbed[i-1];
            int right = (i == flowerbed.length-1) ? 0 : flowerbed[i+1];

            if (flowerbed[i] == 0 && left == 0 && right == 0) {
                flowerbed[i] = 1;  // Plant flower
                n--;               // One less flower needed
                if (n == 0) return true;
            }
        }
        return n <= 0;
    }

}
