package linkedlist;

public class Main {

    public static void main(String[] args) {
        LinkedList<Integer> myLinkedList = new LinkedList(4);
        myLinkedList.printList();
        myLinkedList.getLength();
        System.out.println("\n" + myLinkedList.removeLast());
        System.out.println('\n');
        myLinkedList.printList();
        myLinkedList.getLength();
        /*
            EXPECTED OUTPUT:
            ----------------
            Head: 4
            Tail: 4
            Length: 1
            Linked List:
            4
        */

    }

}