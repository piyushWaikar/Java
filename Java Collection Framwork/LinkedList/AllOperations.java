import java.util.*;
public class AllOperations {

    Node head;
    private int size ;

    AllOperations(){
        this.size = 0;
    }

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size ++;
        }

    }

    // add On First place / add from front side
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    // add On Last place / add from last side
    public void addLast(String data) {
        
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node currNode = head;

        while (currNode.next != null) {
            currNode = currNode.next;
        }

        currNode.next = newNode;
    }

    // Traversing Linked List
    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;

        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }

        System.out.println("NULL");

    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("The list is empty");
            return;
        }

        size--;
        head = head.next;
    }

    public void deleteLast() {
        if (head == null) {
            System.out.println("The list is empty");
            return;
        }

        size--;
        // for single element linked list (Corner Case)
        if (head.next == null) {
            head = null;
            return;
        }

        Node secondLast = head;
        Node lastNode = head.next;

        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }

    public void sizeofList(){
        System.out.println("\nSize of the List is : " + size);
    }

    public static void main(String args[]) {

        AllOperations list = new AllOperations();
        System.out.println("\nAdd First Operation");
        list.addFirst("a");
        list.addFirst("is");

        list.printList();

        System.out.println("\nAdd Last Operation(list)");
        list.addLast("list");
        list.printList();

        System.out.println("\nAdd First Operation(This)");
        list.addFirst("This");
        list.printList();

        System.out.println("\nRemoving Elements from First position");
        list.deleteFirst();
        list.printList();

        System.out.println("\nRemoving Elements from Last position");
        list.deleteLast();
        list.printList();

        list.sizeofList();

        System.out.println("\nAfter adding (This) element in List");
        list.addFirst("This");
        list.printList();
        list.sizeofList();

    }
}