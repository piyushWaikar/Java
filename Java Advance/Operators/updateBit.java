// Q] update the 2nd bit ( position = 1 ) of a number n to 1 . (n=0101)

// For output 0 : 1] Bit Mask = 1<<i    2] operation AND with NOT           ==> clear Bit 
// For output 1 : 1] Bit Mask = 1<<i    2] operation OR                     ==> Set Bit

import java.util.*;

public class updateBit {
    public static void main(String args[]) {

        System.out.print("Enter the number(0 or 1) : ");
        Scanner sc = new Scanner(System.in);
        int oper = sc.nextInt();

        int n = 5;
        int pos = 1;

        int bitMask = 1 << pos;

        if (oper == 1) {
            // set Bit

            int newNumber = bitMask | n;
            System.out.println(newNumber);

        }

        else {
            int newBitMask = ~(bitMask);
            int newNumber = newBitMask & n;
            System.out.println(newNumber);

        }

    }
}