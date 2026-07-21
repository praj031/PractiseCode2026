package DSA.LinkedListDS.Theory;

public class SinglyLinkedListDS {
    //learn Linked list data structure All lecture here only.
    public static void main(String[] args) {

        //This is how we put in the values inside the linked list
        //Keep note usually in the DSA question you don't need to write these code as already it will be provided.
        Node<Integer> head = new Node<>(1);
        Node<Integer> nn1 = new Node<>(4);
        Node<Integer> nn2 = new Node<>(7);
        Node<Integer> nn3 = new Node<>(8);
        Node<Integer> nn4 = new Node<>(2);

        //This is how you link all the values inside the linked list.
        //Make sure to start from the head and go till the tails.ooooooooo
        head.next = nn1;
        nn1.next = nn2;
        nn2.next = nn3;
        nn3.next = nn4;
        nn4.next = null;
        //This signifies that the n4 value will be the tail of the linked list.

        //Function call :
        printLinkedList(head);
        insertIntoLinkedList(2,66,head);
        deleteInsideLinkedList(2,head);

    }

    //How to traverse through the linked List
    public static void printLinkedList(Node<Integer> head){
        Node<Integer> temp = head; // Telling that the temp value will be the node means head of the LL. Temp is initialized to point to the head node
        while (temp != null){ // Continue while the current node is not null. When temp becomes null, we've reached the end of the linked list
            System.out.print(temp.val + " ");
            temp = temp.next;  //This is iterating throughout the loop. Move to the next node, temp will act as iterator which will traverse throughout the LL.
        }
        System.out.println();
        /*
        Overall flow :
        temp = head → Start from the first node.
        while (temp != null) → Keep traversing until there are no more nodes.
        System.out.println(temp.val) → Process the current node.
        temp = temp.next → Move to the next node.
        When temp becomes null, the traversal ends.
         */
    }

    // How to insert data into the linked list.
    public static void insertIntoLinkedList(int pos, int data, Node<Integer> head){

        Node<Integer> temp = head;  //We took a variable in which we set our node//
        for(int i=0;i<pos-1;i++){ //We will move our pointer to the one place before the position we need to add[Suppose we need to add after 2nd pos - so we move till 2nd position]
            temp = temp.next; //pointer will move.
        }
        Node<Integer> newNode = new Node<>(data);// By doing this we are creating a new node which will be placed between the previous and the next node.
        newNode.next = temp.next; //Like the swaping logic, we will be placing the newNode just after the current placed node and then set it with the iterating node, which is temp.next
        temp.next = newNode; //Here we will place temp.next as the next node.

        //Now the same process we did to iterate through linked list.
        Node<Integer> finalTemp = head;
        while (finalTemp != null){
            System.out.print(finalTemp.val + " ");
            finalTemp = finalTemp.next;
        }
        System.out.println();

    }

    public static void deleteInsideLinkedList(int pos, Node<Integer> head){

        //How to delete element inside teh linked List
        Node<Integer> temp = head; //Making a temp iterator
        for(int i=0;i<pos-1;i++){ //Creating a for loop that will be moving till the position where the element need to be deleted.
            temp = temp.next; //Iterator update
        }
        temp.next = temp.next.next; //Telling that temp to point now to the next to next element

        //Now the same process we did to iterate through linked list.
        Node<Integer> finalTemp = head;
        while (finalTemp != null){
            System.out.print(finalTemp.val + " ");
            finalTemp = finalTemp.next;
        }
        System.out.println();

    }



}

//This is how we create a linked list.
//This is not a default LL, this is something which is created by us by default, and we can use this class in our
//main class.
class Node<E>{

    E val;
    Node<Integer> next;

    public Node(E val) {
        this.val = val;
        this.next = null;
    }
}


