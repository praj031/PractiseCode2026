package Java8features.StreamAPIQuestions;

import java.util.*;

public class IntersectionOfTwoList {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("apple", "banana", "kiwi", "orange", "pear");
        List<String> list2 = Arrays.asList("banana", "orange", "grape", "watermelon");

        List<String> contains = list1.stream()
                .filter(list2::contains)
                .toList();
        System.out.println("List 2 contains : "+contains);

        withoutLambdaExpression();
    }

    static void withoutLambdaExpression(){

        String[] list1 = {"apple", "banana", "kiwi", "orange", "pear"};
        String[] list2 = {"banana", "orange", "grape", "watermelon"};

        List<String> result = new ArrayList<>();

        for(int i=0;i<list1.length;i++){
            for(int j=0;j<list2.length;j++){
                if(list1[i].equalsIgnoreCase(list2[j])){
                    result.add(list1[i]);
                }
            }
        }
        System.out.println("Final List == "+result);

    }

}

/*
25. Write a program to find the intersection of two lists of strings using Java Stream API.
 */
