package InterviewPractice.December;

public class Program10 {

    //Given a string lowercase → uppercase and uppercase → lowercase
    public static void main(String[] args) {
        toggledString("My NaMe IS AAtherA","My NaMe IS AAtherA");
    }

    static void toggledString(String upperCaseString,String lowerCaseString){

        String newUpperCaseString = "";
        String newLowerCaseStrring = "";

        System.out.println("Value of upper to lower case new string = "+upperCaseString.toLowerCase());
        System.out.println("Value of lower to upper case new String = "+lowerCaseString.toUpperCase());

    }

}
