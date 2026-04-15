package InterviewPractice.December;

public class Program3 {

    public static void main(String[] args) {
        //Right angle triangle with n=4
        pattern1(4);

    }

    static void pattern1(int n){
        //Right angle triangle pattern
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print("*");
            }
            System.out.println();

        }
    }

}

/*

*
**
***

 */
