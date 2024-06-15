// Q] Get the bit(position = 2) of a number n. (n=0101)(5).

// Get bit operation uses AND operator .
// Bit Mask = 0001 
// operator = AND 

public class getBit {
    public static void main(String args[]) {

        int n = 5;
        int pos = 2;
        int bitMask = 1 << pos;

        if ((bitMask & n) == 0) {
            System.out.println("Bit was zero");
        } else {
            System.out.println("Bit was one");
        }

    }
}