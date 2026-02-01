package InterviewPractice.January2026;

public class Program18 {

    static void main(String[] args) {

        int n=13;
        int count=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(count+" ");
                count++;
            }
           System.out.println();

        }


    }

}
