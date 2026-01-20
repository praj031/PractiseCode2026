package DSA;

public class NumberOfSetBits {

    static void main(String[] args) {

        int count = 0;
        int number = 9;
        int[] binaryNumber = new int[1000];

        int i = 0;
        while (number > 0){
           binaryNumber[i] = number%2;
           number = number/2;
           i++;
        }
        for (int j = i - 1; j >= 0; j--) {
            System.out.println(binaryNumber[j]);
            if(binaryNumber[j]==1){
                count++;
            }

        }
        System.out.println("  ");
        System.out.println(count);


    }
}
