package InterviewPractice.December;

public class Program6 {

    //Given a string, count how many times a given character appears in it (e.g., count 'a' in "java and spring").
    public static void main(String[] args) {

        System.out.println("Number of times 'a' comes in = "+countOfChar("java and spring and spring boot and amazing adventure"));

    }

    static int countOfChar(String str){
        int length = str.length()-1;
        System.out.println(length);
        char tobefound = 'a';
        int count = 0;
        for(int check = 0;check <= length;check++) {
            if (str.charAt(check) == tobefound) {
                count++;
            }
        }
        return count;

    }


}
