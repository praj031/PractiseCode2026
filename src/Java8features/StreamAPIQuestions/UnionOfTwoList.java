package Java8features.StreamAPIQuestions;

import java.util.*;
import java.util.stream.Stream;

public class UnionOfTwoList {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2 = Arrays.asList(4, 5, 6, 7, 8);
        List<Integer> finalList = Stream.concat(list1.stream(),list2.stream())
                .distinct()
                .toList();
        System.out.println("Concatenated list = "+finalList);
    }
}

/*

29. Write a program to find the union of two lists of integers using Java Stream API.

 */