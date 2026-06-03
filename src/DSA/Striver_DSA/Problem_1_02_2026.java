package DSA.Striver_DSA;

public class Problem_1_02_2026 {
    //setZeroes

    public static void main(String[] args) {

        int[][] matrix = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        int m = matrix.length; //To get rows
        int n = matrix[0].length;//To get column

        for(int i = 0; i<m ; i++){ //Row loop
            for(int j=0;j<n;j++){ //Column loop
                if(matrix[i][j] == 0){
                    // Mark entire row as -1 (except zeros)
                    for (int col = 0; col < n; col++) {
                        if (matrix[i][col] != 0)
                            matrix[i][col] = -1;
                    }
                    // Mark entire column as -1 (except zeros)
                    for (int row = 0; row < m; row++) {
                        if (matrix[row][j] != 0)
                            matrix[row][j] = -1;
                    }
                }
            }
        }
        //Reset it to 0
        for(int i = 0; i<m ; i++) {
            for (int j = 0; j < n; j++) {
                if(matrix[i][j] == -1){
                    matrix[i][j] = 0;
                }
            }
        }
        //Print the matrix
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }

    }

}
