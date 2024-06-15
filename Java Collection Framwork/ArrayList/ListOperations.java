
import java.util.ArrayList;
import java.util.Collections;

public class ListOperations {
    public static void main(String args[]) {

        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<String> list2 = new ArrayList<String>();
        ArrayList<Boolean> list3 = new ArrayList<Boolean>();

        System.out.println("\nAdded the elements in list and printed : ");
        // add elements
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);

        System.out.println("\nGet Elemenet operation is performed : ");
        // to get an element
        int element = list.get(0); // 0 is the index
        System.out.println(element);

        System.out.println("\nAdded elements in between using index : ");
        // add element in between
        list.add(1, 2); // 1 is the index and 2 is the element to be added
        System.out.println(list);

        System.out.println("\nRemoving element using index and substituting another element(set) : ");
        // set element
        list.set(0, 0);
        System.out.println(list);

        System.out.println("\nDeleting elememts using index : ");
        // delete elements
        list.remove(0); // 0 is the index
        System.out.println(list);

        System.out.println("\nPrint size of List using function : ");
        // size of list
        int size = list.size();
        System.out.println(size);

        System.out.println("\nTraversing List using for Loop : ");
        // Loops on lists
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        System.out.println("\nSorting List using Collection.sort(list) Function : ");
        // Sorting the list
        list.add(0);
        Collections.sort(list);
        System.out.println(list);

        System.out.println();
    }
}
