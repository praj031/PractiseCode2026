package InterviewPractice.December;

public class Program11 {
    //Given a string, toggle case of each character: lowercase → uppercase and uppercase → lowercase

    public static void main(String[] args) {
        String result = toggleStringByEachCharacter("My nAMe is AAtheRa");
        System.out.println("Toggled String = "+result);
    }

    static String toggleStringByEachCharacter(String string){

        String newString = "";

        for(int i=0;i<string.length();i++){
            char ch = string.charAt(i); // to get each character and store it in a new variable

            if(ch >= 'A' && ch <= 'Z'){
                  newString = newString + (char)(ch+32);
            }
            else if (ch >= 'a' && ch <= 'z'){
                newString = newString + (char)(ch-32);
            }
            else {
                newString = newString+ch;
            }

        }

        return newString;
    }

}
