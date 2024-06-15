import java.util.*;

public class TreeMap_class {
    public static void main(String args[]) {

        // Creating an instance of TreeMap with String keys and Integer values
        TreeMap<String, Integer> map = new TreeMap<>();
        
        // Adding key-value pairs to the TreeMap
        map.put("Z", 35000);
        map.put("P", 52000);
        map.put("A", 28000);
        map.put("D", 95000);
        map.put("M", 65000);

        // Printing the contents of the TreeMap
        System.out.println("\nThe TreeMap contains : " + map);

        // Retrieving the keys from the TreeMap
        Set<String> keys = map.keySet();
        System.out.println("\nThe keys are : " + keys);

        // Updating the balance for key "A"
        int balance = map.get("A");
        map.put("A", balance + 1000);
        System.out.println("\nA's new balance : " + map.get("A"));

        // Removing the entry with key "D"
        map.remove("D");
        System.out.println("\nAfter removing D, the TreeMap contains : " + map);

        // Adding a new entry with key "F" and value 55000
        map.put("F", 55000);
        System.out.println("\nAfter Adding F, the TreeMap contains : " + map);

        // Creating a SortedMap that contains entries with keys greater than or equal to "M"
        SortedMap<String, Integer> sm = map.tailMap("M");
        System.out.println("\nEntries having keys >= M are : " + sm);

        System.out.println();
    }
}
