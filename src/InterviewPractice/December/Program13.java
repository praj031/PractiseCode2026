package InterviewPractice.December;

public class Program13 {

    //Take a 3-digit number and check if all digits are distinct.
    public static void main(String[] args) {

        String str = "234";

        char checkpoint = str.charAt(0);

        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == checkpoint){
                System.out.println("Not Distinct");
            }
            else {
                System.out.println("Distinct !!!");
            }
        }

    }

}
