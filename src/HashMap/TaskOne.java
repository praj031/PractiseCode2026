package HashMap;

import java.util.ArrayList;
import java.util.List;

public class TaskOne {
    public static void main(String[] args) {
        int[] inputs = {1,2,3,4,5};
        printArrayList(inputs);

    }
    static void printArrayList(int[] inputs){

        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i=0;i<inputs.length;i++){
            arrayList.add(inputs[i]);
        }
        System.out.print("Element : ");
        for (int i=0;i<arrayList.size();i++){
            System.out.print(arrayList.get(i)+ " ");

        }

    }
}

/*
Your task:
Write a method that accepts an integer array and uses an ArrayList<Integer> to:

1) Add all elements from the input array to a new ArrayList.

2) Print the final output in this format:
Elements: 1 2 3 4 5 (where 1 2 3 4 5 are the values from the input array).

Instructions:

Create a method called printArrayList(int[] input) inside the TaskOne class.

Initialize an empty ArrayList<Integer>.

Use a for loop to add all elements from the array into the ArrayList.

Print the list using a space-separated format with "Elements:" as the prefix.

Do not use main() for input or printing.
 */
