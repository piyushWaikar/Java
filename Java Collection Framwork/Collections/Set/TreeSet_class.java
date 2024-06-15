import java.util.*;

public class TreeSet_class {
    public static void main(String args[]) {

        // Creating an instance of TreeSet
        TreeSet<String> tree = new TreeSet<>();

        // Adding elements to the TreeSet
        tree.add("D");
        tree.add("A");
        tree.add("S");
        tree.add("F");
        tree.add("C");

        // Printing the contents of the TreeSet
        System.out.println("\nThe contents of set : " + tree);
        
        // Printing the size of the TreeSet
        System.out.println("\nThe size of set : " + tree.size());

        // Creating a SortedSet that contains elements less than "D"
        SortedSet<String> s = tree.headSet("D");
        System.out.println("\nThe elements >= D are : " + s);

        // Creating a SortedSet that contains elements greater than or equal to "D"
        s = tree.tailSet("D");
        System.out.println("\nThe elements >= D are : " + s);

        // Creating a SortedSet that contains elements >= "C" and < "S"
        s = tree.subSet("C", "S");
        System.out.println("\nThe elements >= C and < S are : " + s);

        System.out.println();
    }
}
