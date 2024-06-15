class Student {
    String name;
    int age;


public void getInfo() {
    System.out.println(this.name);
    System.out.println(this.age);
}
}

public class student {
public static void main(String args[]){
        
    Student s1 = new Student();
    s1.name = "Aman";
    s1.age = 25;
    s1.getInfo();

    }
}