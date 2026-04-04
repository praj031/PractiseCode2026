package Java8features.StreamAPIQuestions;

import java.util.Arrays;
import java.util.List;

public class FindCharactersInStream {

    public static void main(String[] args) {
        usingStream();
        withoutStream();
    }

    static void usingStream(){
        List<String> strings = Arrays.asList("apple", "banana", "orange", "grape", "rose");
        char checkChar = 'a';
        long count = strings.stream()
                .filter(s->s.contains(String.valueOf(checkChar)))
                .count();
        System.out.println("The count of letter having 'a' as a character are : "+count);

    }

    static void withoutStream(){
        String[] str = {"apple", "banana", "orange", "grape", "rose"};
        char checkChar = 'a';
        int count = 0;
        for(int i=0;i< str.length;i++){
            String words = str[i];
            if(words.contains(String.valueOf(checkChar))){
                count++;
            }
        }
        System.out.println("The count of letter having 'a' as a character are : "+count);
    }
}
