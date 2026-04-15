package InterviewPractice.December;

public class Program9 {

    //Given a sentence, count the number of words without using split() (iterate and detect spaces).
    public static void main(String[] args) {
        System.out.println("Count of string = "+countOfSpace("My name is Khan and I am not  Muslim"));
    }

    static int countOfSpace(String string){

        char space = ' ';
        int count=0;

        for(int i=0;i<string.length();i++){
            if(string.charAt(i)== ' '){
                count++;
            }
        }

        return count;
    }

}
