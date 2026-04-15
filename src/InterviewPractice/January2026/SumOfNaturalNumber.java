package InterviewPractice.January2026;

public class SumOfNaturalNumber {

    static void main(String[] args) {

        int number = 12 ;
        sumofN_NaturalNUmber(number);
    }

    private static void sumofN_NaturalNUmber(int number) {

        int sum = 0;
        for(int i=1;i<number;i++){
            sum = sum + i;
        }
        System.out.println(sum);

    }
}
