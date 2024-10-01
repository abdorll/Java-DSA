package linkedlist;

public class LinkedList {

    private Node head, tail;
    private int length;

    LinkedList(int value){
        Node newNode = new Node(value);
        length = 1;
        head = newNode;
        tail = newNode;
    }

    class Node {
        Node next;
        int value;
        Node(int value){
            this.value = value;
        }
    }

    public void printList(){
        Node node = head;
        while(node!=null){
            System.out.println(node.value);
            node = node.next;
        }
    }

    public void getHead() {
        if (head == null) {
            System.out.println("Head: null");
        } else {
            System.out.println("Head: " + head.value);
        }
    }

    public void getTail() {
        if (head == null) {
            System.out.println("Tail: null");
        } else {
            System.out.println("Tail: " + tail.value);
        }
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }

    public void append(int value){
        Node lastNode = new Node(value);
        if(head == null){
            head = lastNode;
            tail = lastNode;
        }
        else{
            tail.next = lastNode;
            tail = lastNode;
        }
        length++;
    }

    public Node removeLast(){
        Node right = head, left = head;
        if(head == null) return null;
        if(length == 1){
            head = null;
            tail = null;
            length--;
            return head;
        }else{
            while(right.next != null){
                left = right;
                right = right.next;
            }
            tail = left;
            tail.next = null;
            length--;
        }
        return right;
    }

    public Node prepend(int value){
    Node start = new Node(value);
    start.next = head;
    head = start;
        return new Node(3);
    }
}