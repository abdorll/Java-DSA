package linkedlist;

public class Main {

    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(4);
        myLinkedList.append(6);
        myLinkedList.append(9);
        myLinkedList.append(5);
        myLinkedList.append(2);
        myLinkedList.getLength();
        myLinkedList.reverse();
        myLinkedList.printList();
    }

}