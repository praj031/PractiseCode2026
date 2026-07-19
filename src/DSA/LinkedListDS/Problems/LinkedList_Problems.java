package DSA.LinkedListDS.Problems;


public class LinkedList_Problems {

    public static void findMiddleOFLinkedList(Node<Integer> head){
        //Brute Force -- Finding the middle element of the linked list
        int count = 0;
        Node<Integer> temp = head;
        // Count nodes
        while(temp != null){
            count++;
            temp = temp.next;
        }
        // Reset temp
        temp = head;
        int jump = count / 2;
        // Move to middle
        for(int i = 0; i < jump; i++){
            temp = temp.next;
        }
        //Again reiterating from middle to end./
        while (temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }//

    public static boolean hasCycle(Node<Integer> head) {

        Node<Integer> slow = head;
        Node<Integer> fast = head;

        while (fast != null && fast.next != null){

            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                return true;
            }
        }

        return false;
    }



}
