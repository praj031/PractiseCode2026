package InterviewPractice.December;

public class Program5 {

    public static void main(String[] args) {



        String name = "Pritish";
        String newString = "";
        int end = name.length()-1;

        while (end >= 0) {  // Opposite condition
            newString = newString + name.charAt(end) ;  // Prepend, don't overwrite
            end--;
        }
        System.out.println(newString);



    }

}

