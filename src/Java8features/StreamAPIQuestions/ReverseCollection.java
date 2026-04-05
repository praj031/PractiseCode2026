package Java8features.StreamAPIQuestions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseCollection {
    public static void main(String[] args) {
        usingLambda();
        withoutUsingLambda();
    }
    static void usingLambda(){
        List<String> strings = Arrays.asList("apple", "banana", "kiwi", "orange", "pear");
        Collections.reverse(strings);
        System.out.println("Reverse of the collection is : "+strings);
    }
    static void withoutUsingLambda(){
        String[] str = {"apple", "banana", "kiwi", "orange", "pear"};
        System.out.print("Reverse of the collection : [");
        for(int i=str.length -1; i >= 0; i--){
            System.out.print(str[i]+" ");
        }

    }
}
