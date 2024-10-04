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

    public void prepend(int value){
    Node start = new Node(value);
    if(head == null){
    head = start;
    tail = start;
    } else{
    start.next = head;
    head = start;
    }
    length++;
    }

    public Node removeFirst(){
        Node first = head;
        if(head == null) return null;
        if(length == 1){
            head = null;
            tail = null;
        }else{
            head = first.next;
            first.next = null;
        }
        length--;
        return first;
    }

    public Node get(int index){
        if(head == null) return null;
        Node current = head;
        if(index <0 || index >= length){
            System.out.println("Invalid index: Out of range!");
            return null;
        }else{
            for(int i =0; i<index; i++){
            current = current.next;
            }
        }
        return current;
    }

    public void set(int index, int value){
        Node node = get(index);
        node.value = value;
    }

    public boolean insert(int index, int value){
        if(index <0 || index > length) return false;
        if(index == 0) {
            prepend(value);
            
        }
        if(index == length-1) {
            append(value);
        }
         if(index >0 && index <=length){
        Node prev = get(index-1);
        Node node = new Node(value);
        node.next = prev.next;
        prev.next = node;
         }
        length++;
        return true;
    }

    public Node remove (int index){
        Node node = head;
        if(index < 0 || index >=length){
            System.out.println("Invalid index: Out of range!");
            return null;
        }
        if(head == null){
            node = null;
        }else if(length == 1){
            node = head;
            head = null;
            tail = null;
        } else if(index == 0){
            return removeFirst();
        } else if(index == length-1){
            return removeLast();
        }
        else{
            Node prev = get(index-1);
            Node item = prev.next;
            node = item;
            prev.next = item.next;
            item = null;
        }
        length--;
        return node;
    }

    public void reverse(){
        if(head == null) {
            System.out.println("Invalid index: Out of range!");
        }
        if(length >1){
            Node prev = null, current = head, next = head.next;
            head = tail;
            tail = current;
            for(int i=0; i< length; i++){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            }
        }
    }
}
