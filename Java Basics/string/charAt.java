public class charAt {
    public static void main(String args[]) {

        String name = "Aman";
        System.out.println(name.charAt(3));

        // This function print the string elements one by one : 
        
        for (int i = 1; i <= name.length(); i++) {
            System.out.println(name.charAt(i));
        }
    }
}
