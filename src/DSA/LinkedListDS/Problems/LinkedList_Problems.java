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

    public static Node<Integer> reverseLL(Node<Integer> head){

        Node<Integer> previous = null;
        Node<Integer> current = head;
        while (current != null){

            Node<Integer> next = current.next;
            current.next = previous;
            previous = current;
            current = next;

        }

        return previous;

    }

    public static void removeNthNodeFromEnd(Node<Integer> head, int n){
        Node<Integer> temp = head;
        int count = 0;
        while (temp != null){
            count++;
            temp = temp.next;
        }
        temp = head;
        int pos = count - n;
        for(int i=0;i<pos-1;i++){
            temp = temp.next;
        }
        if (pos == 0) {
            //return head.next;
        }
        temp.next = temp.next.next;
        temp = head;
        while (temp != null){
            System.out.print(temp.val + " --> ");
            temp = temp.next;
        }
    }

    public boolean isPalindrome(Node<Integer> head) {

        if (head == null || head.next == null) {
            return true;
        }
        Node<Integer> slow = head;
        Node<Integer> fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node<Integer> prev = null;
        while (slow != null) {
            Node<Integer> next = slow.next;
            slow.next = prev;
            prev = slow;
            slow = next;
        }
        Node<Integer> first = head;
        Node<Integer> second = prev;
        while (second != null) {
            if (first.val != second.val) {
                return false;
            }
            first = first.next;
            second = second.next;
        }
        return true;
    }//m
}
