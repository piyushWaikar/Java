

public class Exception_Handling {
    public static void main(String args[]) {

        int[] marks = { 98, 99, 97 };
        try {

            // In this part we have to put things that can cause error and due to error system get stop .
            
            System.out.println(marks[5]); // marks[5] is out of bound of array due to space 3 .

        } catch (Exception exception) {
            // do something afer catching an exception
        }

        System.out.println("The name is Aman");

    }
}