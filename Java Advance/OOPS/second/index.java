import java.util.Scanner;

class Student {
    String name;
    int age;
    double rollNo;
    String course;

    public void studentInfo() {
        System.out.println("Student info : \n");
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.rollNo);
        System.out.println(this.course);
    }

    public void studentFees() {
        if (this.course.equals("bca")) {
            System.out.println("50,000");
        } else if (this.course.equals("bcs")) {
            System.out.println("47,500");
        } else {
            System.out.println("Try later ");
        }
    }
}

public class index {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s1 = new Student();

        System.out.print("Enter Name : ");
        s1.name = sc.nextLine();

        System.out.print("Age : ");
        s1.age = sc.nextInt();

        System.out.print("Roll No. : ");
        s1.rollNo = sc.nextInt();

        System.out.print("Enter Course : ");
        Scanner ac = new Scanner(System.in);
        s1.course = ac.nextLine();

        s1.studentInfo();

        s1.studentFees();
    }
}