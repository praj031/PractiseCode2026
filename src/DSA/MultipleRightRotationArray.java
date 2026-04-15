package DSA;

public class MultipleRightRotationArray {


    static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int[] b = {2, 3, 1};
        int[][] ans = multipleRightRotations(a, b);

        for(int[] e : ans) {
            printArray(e);
            System.out.println();
        }
    }

    static int[][] multipleRightRotations(int[] a, int[] b) {
        int n = a.length;
        int m = b.length;
        int[][] ans = new int[m][n];
        //Making the given array as 2 time the original array
        int temp[] = new int[2*n];
        for(int i = 0; i<n; i++) {
            temp[i] = a[i];
            temp[i+n] = a[i];
        }
        //Process query -- means how many times the array loop will run
        for(int i = 0; i<m; i++) {
            int offset = (n - (b[i] % n)) % n;
            for(int j = 0; j<n; j++) {  //removing the initial elements and adding in the new elements
                ans[i][j] = temp[j+offset];
            }
        }
        return ans; //Returning back the elements
    }

    static void printArray(int[] a) {
        for(int e: a) {
            System.out.print(e + " ");
        }
    }

}
