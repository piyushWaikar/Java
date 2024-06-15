// Q] Clear the 3rd bit(position = 2) of a number n. (n=0101).

// Clear Bit operation uses AND with NOT operator .
// Bit Mask = 0001
// Operator : AND with NOT(Bit Mask) 

public class clearBit {
    public static void main(String args[]) {

        int n=5;
        int pos = 2;
        int bitMask = 1<<pos;
        int notBitMask = ~(bitMask);

        int newNumber = notBitMask & n;
        System.out.println(newNumber);

    }
}