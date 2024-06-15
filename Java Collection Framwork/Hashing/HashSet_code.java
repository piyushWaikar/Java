
// Set contains unique elements only 

import java.util.HashSet;
import java.util.Iterator;

public class HashSet_code {
    public static void main(String args[]) {
        // Creating
        HashSet<Integer> set = new HashSet<>();

        // Inserting
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);
        set.add(5);

        // Search - Contains
        if (set.contains(1)) {
            System.out.println("\n" + "Set contains 1");
        }
        if (!set.contains(6)) {
            System.out.println("Set does not contains 6" + "\n");
        }

        // Remove - Delete
        set.remove(1);

        if (!set.contains(1)) {
            System.out.println("does not contains 1 - we deleted it" + "\n");
        }

        // Size of set
        System.out.println("The size of set is : " + set.size() + "\n");

        // Print all the elements in set
        System.out.println(set + "\n");

        // Iterator
        Iterator it = set.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}