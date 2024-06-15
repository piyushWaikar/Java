import java.util.*;

public class Operations {
    public static void main(String args[]) {

        // Create a LinkedList with String elements
        LinkedList<String> list = new LinkedList<>();

        // Add elements to the LinkedList
        list.add("a");
        list.add("b");
        list.add("10");

        // Print the contents of the list
        System.out.println("\nThe contents of list are: " + list);

        // Print the size of the list
        System.out.println("\nThe size of list is: " + list.size());

        // Add "C" to the end of the list
        list.addLast("C");

        // Insert "D" at index 2
        list.add(2, "D");

        // Insert "E" at index 1
        list.add(1, "E");

        // Remove the first element from the list
        list.removeFirst(); // or list.remove()

        // Print the contents of the modified list
        System.out.println("\nThe contents of list are: " + list);

        // Print the size of the modified list
        System.out.println("\nThe size of list is: " + list.size());

        System.out.println();
    }
}
