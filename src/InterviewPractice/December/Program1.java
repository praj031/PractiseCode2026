package InterviewPractice.December;

public class Program1 {

    public static void main(String[] args) {

        sumFirstN(10);
    }

    public static int sumFirstN(int n) {
        int sum = 0;
        for(int i=0;i<n;i++){
            sum=sum+i;
        }
        return sum;
    }

}