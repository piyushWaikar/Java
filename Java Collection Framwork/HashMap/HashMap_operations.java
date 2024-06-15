
import java.util.*;

public class HashMap_operations {
    public static void main(String args[]) {

        // Create a HashMap with String keys and Integer values
        HashMap<String, Integer> hm = new HashMap<>();

        // Populate the HashMap with key-value pairs
        hm.put("Z", 35000);
        hm.put("P", 52000);
        hm.put("A", 28000);
        hm.put("D", 95000);
        hm.put("M", 65000);

        // Print the contents of the HashMap
        System.out.println("\nThe HashMap contains : " + hm);

        // Retrieve the keys from the HashMap
        Set<String> keys = hm.keySet();
        System.out.println("\nThe Keys are : " + keys);

        // Retrieve the values from the HashMap
        Collection<Integer> values = hm.values();
        System.out.println("\nThe values are : " + values);

        // Update the balance for key "A"
        int balance = hm.get("A");
        hm.put("A", balance + 1000);
        System.out.println("\nA's new balance is : " + hm.get("A"));

        // Remove the entry with key "D"
        hm.remove("D");
        System.out.println("\nAfter removing D, the HashMap contains : " + hm);

        // Add a new entry with key "F" and value 55000
        hm.put("F", 55000);
        System.out.println("\nAfter Adding F, the HashMap contains : " + hm);

        System.out.println();
    }
}
