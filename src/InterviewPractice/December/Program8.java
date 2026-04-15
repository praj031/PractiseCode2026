package InterviewPractice.December;

public class Program8 {

    //Given a string, remove all spaces (or all occurrences of a given character) and return the new string.

    public static void main(String[] args) {

        String str = "My name is Athera";
        char remove = ' ';
        System.out.println(removeCharacterBuiltIn(str,remove));

        //Approach will be like, we will replace the space string with the non-space string.

    }

    static String removeCharacterBuiltIn(String str, char remove) {
        //Here we are replacing the string value of space with the non-space
        return str.replace(String.valueOf(remove), "");
    }



}
