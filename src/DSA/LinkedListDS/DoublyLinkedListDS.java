package DSA.LinkedListDS;

public class DoublyLinkedListDS {
    //learn Linked list data structure All lecture here only.
    public static void main(String[] args) {

        //This is how we put in the values inside the linked list
        //Keep note usually in the DSA question you don't need to write these code as already it will be provided.
        DoublyNode<Integer> head = new DoublyNode<>(1);
        DoublyNode<Integer> n1 = new DoublyNode<>(4);
        DoublyNode<Integer> n2 = new DoublyNode<>(7);
        DoublyNode<Integer> n3 = new DoublyNode<>(8);
        DoublyNode<Integer> n4 = new DoublyNode<>(2);

        //This is how you link all the values inside the Doubly linked list.
        //Make sure to start from the head and go till the tails.
        head.next = n1;
        n1.prev = head;

        n1.next = n2;
        n2.prev = n1;

        n2.next = n3;
        n3.prev = n2;

        n3.next = n4;
        n4.prev = n3;

        n4.next = null;
        //This signifies that the n4 value will be the tail of the linked list.

        //Function call :
        printLinkedList(head);
        insertIntoDoublyLinkedList(2,66,head);
        deleteFromTheDoublyLinkedList(2,head);
    }

    //How to traverse through the linked List
    public static void printLinkedList(DoublyNode<Integer> head){
        DoublyNode<Integer> temp = head;
        while (temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // How to insert data into the linked list.
    public static void insertIntoDoublyLinkedList(int pos, int data, DoublyNode<Integer> head){

        DoublyNode<Integer> temp = head;
        for(int i=0;i<pos-1;i++){
            temp = temp.next;
        }
        DoublyNode<Integer> newNode = new DoublyNode<>(data);
        newNode.next = temp.next;
        temp.next.prev = newNode; //This is the only change needed
        temp.next = newNode;
        newNode.prev = temp;

        //Now the same process we did to iterate through linked list.
        DoublyNode<Integer> finalTemp = head;
        while (finalTemp != null){
            System.out.print(finalTemp.val + " ");
            finalTemp = finalTemp.next;
        }
        System.out.println();

    }

    //How to delete in the doubly linked list
    public static void deleteFromTheDoublyLinkedList(int pos, DoublyNode<Integer> head){

        DoublyNode<Integer> temp = head;
        for(int i=0;i<pos-1;i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        temp.next.prev = temp;

        //Now the same process we did to iterate through linked list.
        DoublyNode<Integer> finalTemp = head;
        while (finalTemp != null){
            System.out.print(finalTemp.val + " ");
            finalTemp = finalTemp.next;
        }
        System.out.println();
    }

}

//This is how we create a Doubly linked list.
//This is not a default LL, this is something which is created by us by default, and we can use this class in our
//main class.
class DoublyNode<E>{

    E val;
    DoublyNode<E> next;
    DoublyNode<E> prev;

    public DoublyNode(E val) {
        this.val = val;
        this.next = null;
        this.prev = null;
    }
}