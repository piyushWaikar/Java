public class Compare {
    public static void main(String args[]) {

        String name1 = "Tony";
        String name2 = "Stark";

        // Compare function output :
        // Case 1 : s1>s2 = +ve value
        // Case 2 : s1=s2 = 0
        // Case 3 : s1<s2 = -ve

        if (name1.compareTo(name2) == 0) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }

    }
}