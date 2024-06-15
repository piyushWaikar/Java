
import java.util.*; // input source

class input {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in); // input syntax .
        Scanner bc = new Scanner(System.in); // input syntax .

        System.out.print("Enter first name : ");

        String a = sc.next(); // we have to take the input and store it in any variable .
        // sc.'next' function can only store 1 name without spaces .

        System.out.println(a);


        // To take whole line of sentence with spaces we have to use another function
        // that is : 'sc.nextLine'.

        System.out.print("Enter your full name : ");

        String b = bc.nextLine();

        System.out.println(b);

    }
}

// Input functions : 

// nextLine();
// nextInt();
// nextFloat();