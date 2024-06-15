// Q] Set the 2nd bit (position = 1) of a number n. (n=0101) = (5 to base 10).

// Set Bit operation use OR operator .
// Bit Mask : 1<<i
// Operator OR .

public class setBit {
    public static void main(String args[]) {

        int n = 5; // 0101
        int pos = 1;
        int bitMask = 1 << pos;

        int newNumber = bitMask | n;
        System.out.println(newNumber);
    }
}