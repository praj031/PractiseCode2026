package InterviewPractice.January2026;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Program3 {

    //Consists all the program done on 14-01-2026


    public static void main(String[] args) {

//        int a=10;
//        if(a==9)
//            System.out.println("value 1");
//            System.out.println("value 2");
//        else
//             System.out.println("Bye");

//        int mark = 55;
//        if(mark >= 80)
//            System.out.println("Pass1");
//        else if (mark >=35)
//            System.out.println("Pass 2");
//        else
//            System.out.println("Pass 3");


        int[] arr =  {1,2,3};
        int[] arr2 = {1,2,3};
        System.out.println(arr == arr2);
        System.out.println(Arrays.equals(arr,arr2));

        String str = "JAVA PROGRAMING   ";
        System.out.println(str.trim());
        System.out.println(str.startsWith("JAVA"));


        String value = "Hello, World";
        System.out.println(
                value.substring(2)
        );
        String value1 = "Java";
        //System.out.println(value1.charAt(4));
        System.out.println(value1.contains(""));


        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(matrix.length);
        int[][] matrix1 = new int[3][3];
        System.out.println(matrix1.length);


        int sum =0;
        for(int i=0;i<matrix.length;i++){
            sum += matrix[i][i];
        }
        System.out.println(sum);






        }



    }



