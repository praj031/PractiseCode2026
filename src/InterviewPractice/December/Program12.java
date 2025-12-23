package InterviewPractice.December;

public class Program12 {
    //Given a string, find the first non-repeating character (character that appears exactly once).
    public static void main(String[] args) {

        String str = "Pritish";
        char result = firstNonRepeatingCharacter(str);

        if (result != '\0') {
            System.out.println("First non-repeating character = " + result);
        } else {
            System.out.println("No non-repeating character");
        }
    }

    static char firstNonRepeatingCharacter(String str) {

        int[] freq = new int[256]; // ASCII characters

        // First pass: count frequency
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        // Second pass: find first character with frequency 1
        for (int i = 0; i < str.length(); i++) {
            if (freq[str.charAt(i)] == 1) {
                return str.charAt(i);
            }
        }

        return '\0'; // indicates no non-repeating character
    }
}
