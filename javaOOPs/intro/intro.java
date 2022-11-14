
class pen {
    String color;
    String type;

    public void write() {
        System.out.println("Write something");
    }

    public void printColor() {
        System.out.println(this.color);

    }
}

class Student {
    String name;
    int age;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Student() {
        System.out.println("constructor called");
    }

    // parametrize constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // copy constructor
    Student(Student s) {
        this.name = s.name;
        this.age = s.age;
    }

}

public class intro {
    public static void main(String args[]) {
        pen pen1 = new pen();
        pen1.color = "blue";
        pen1.type = "ball";

        pen1.write();
        pen pen2 = new pen();
        pen2.color = "black";
        pen2.type = "gel Pen";

        pen1.printColor();
        pen2.printColor();

        Student s1 = new Student();
        s1.name = "Sanjeet";
        s1.age = 21;

        s1.printInfo();
        Student s2 = new Student("Ajay", 20);
        s2.printInfo();

        Student s3 = new Student(s1);
        s3.printInfo();

    }
}
