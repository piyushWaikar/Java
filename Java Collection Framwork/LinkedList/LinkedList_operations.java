
import java.util.*;

public class LinkedList_operations {
    public static void main(String args[]) {

        LinkedList list = new LinkedList();
        list.add("a");
        list.add("b");
        list.add("10");
        System.out.println("The contents of list is : " + list);
        System.out.println("The size of list is : " + list.size());
        list.addLast("C");
        list.add(2, "D");
        list.add(1, "E");
        list.remove();
        System.out.println("The contents of list is : " + list);
        System.out.println("The size of list is : " + list.size());

    }
}