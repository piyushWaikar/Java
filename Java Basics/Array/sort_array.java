import java.util.Arrays; // This file is used to use the functions of arrays .

public class sort_array {
    public static void main(String args[]) {

        int[] marks = new int[5];

        marks[0] = 99;
        marks[1] = 96;
        marks[2] = 99;
        marks[3] = 90;
        marks[4] = 91;

        System.out.println(marks[0]);
        Arrays.sort(marks);
        System.out.println(marks[0]);

    }
}