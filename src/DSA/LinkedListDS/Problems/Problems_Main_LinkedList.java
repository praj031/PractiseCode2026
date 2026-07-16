package DSA.LinkedListDS.Problems;

public class Problems_Main_LinkedList {

    public static void main(String[] args) {

        //Basic syntax of making a linked list.
        Node<Integer> head = new Node<>(1);
        Node<Integer> n1 = new Node<>(4);
        Node<Integer> n2 = new Node<>(7);
        Node<Integer> n3 = new Node<>(12);
        Node<Integer> n4 = new Node<>(9);
        Node<Integer> n5 = new Node<>(2);
        Node<Integer> n6 = new Node<>(5);

        head.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = null;


        //List of problems
        LinkedList_Problems.findMiddleOFLinkedList(head);


    }

}

//Main linked list class for initialization of node and it's next object
class Node<E>{

     E val;
     Node<E> next;

    public Node(E val) {
        this.val = val;
        this.next = null;
    }
}

