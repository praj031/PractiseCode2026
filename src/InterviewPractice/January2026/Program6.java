package InterviewPractice.January2026;

public class Program6 {
    public static void main(String[] args) {


        int[][] matrix = {

                {1,2,3},
                {4,5,6},
                {7,8,9}

        };

        System.out.println(matrix.length);
        int sum22 = 0;
        for(int i=0;i<matrix.length;i++){
            sum22 += matrix[i][matrix.length-i-1];
        }
        System.out.println(sum22);
        int sum = 0;
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                sum += anInt;
            }
        }
        System.out.println(sum);


        AnotherPrg.dummy();

        dummy2(); // Direct call the static method here


    }

    static void dummy2(){
        System.out.println("dummy 2");
    }


}
 class AnotherPrg{


    static void dummy(){
        Program6.dummy2();
        System.out.println( "Dummy OP " );
    }
}