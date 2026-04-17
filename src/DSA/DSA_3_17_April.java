package DSA;

public class DSA_3_17_April {

    public static void main(String[] args) {
        bruteForce();
        System.out.println(" ");
        sortedSquares();
    }

    static void sortedSquares(){

        int[] arr = {-4,-1,0,3,10};
        int n = arr.length;
        int left = 0;
        int right = n-1;
        int pos = n-1;
        int[] result = new int[n];

        while (left<=right){

            int leftSquare = arr[left] * arr[left];
            int rightSquare = arr[right] * arr[right];

            if (leftSquare > rightSquare){
                result[pos] = leftSquare;
                left++;
            } else {
                result[pos] = rightSquare;
                right--;
            }
            pos--;
        }
        System.out.print("Optimised output : ");
        for (int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }
    }

    static void bruteForce(){
        int[] arr = {-4,-1,0,3,10};
        int length = arr.length;
        int[] product = new int[length];
        int temp = 0;
        //Find the product, by iterating all the way to array.length
        for(int i=0;i<arr.length;i++){
            product[i] = arr[i]*arr[i];
        }
        //Print the new product array using product array.
        System.out.print("Product array = ");
        for(int i=0;i<product.length;i++){
            System.out.print(product[i]+" ");
        }
        System.out.println(" ");
        for(int i=0;i<product.length;i++){
            for(int j=i+1;j<product.length;j++){
                if(product[j]<product[i]){
                    temp = product[i];
                    product[i] = product[j];
                    product[j] = temp;
                }
            }
        }
        System.out.print("Sorted Array = ");
        for(int i=0;i<product.length;i++){
            System.out.print(product[i]+" ");
        }
    }

}
