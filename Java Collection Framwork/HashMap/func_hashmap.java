
import java.util.*;

public class func_hashmap {
    public static void main(String args[]) {

        HashMap hm = new HashMap();

        hm.put("Z", 35000);
        hm.put("P", 52000);
        hm.put("A", 28000);
        hm.put("D", 95000);
        hm.put("M", 65000);

        System.out.println("\nThe HashMap contains : " + hm);

        Set Keys = hm.keySet();
        System.out.println("\nThe Keys are : " + Keys);

        Collection values = hm.values();
        System.out.println("\nThe values are : " + values);

        int balance = (int) hm.get("A");
        hm.put("A", balance + 1000);
        System.out.println("\nA's new balance is : " + hm.get("A"));

        hm.remove("D");
        System.out.println("\nAfter removing D , the HashMap contains : " + hm);

        hm.put("F", 55000);
        System.out.println("\nAfter Adding F , the HashMap contains : " + hm);

    }
}