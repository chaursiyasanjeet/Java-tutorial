class Person {
    String Name;
    String Address;

    Person(String name, String add) {
        Name = name;
        Address = add;
    }

    void display() {
        System.out.println("Name:" + Name);
        System.out.println("Address:" + Address);
    }
}

class Teacher extends Person {
    String Department;
    String officeAdd;

    Teacher(String name, String add, String dept, String offadd) {
        super(name, add);
        Department = dept;
        officeAdd = offadd;
    }

    void display() {
        System.out.println("Name of the teacher:" + Name);
        System.out.println("Address of the teacher:" + Address);
        System.out.println("Department of the teacher:" + Department);
        System.out.println("Office address of the teacher:" + officeAdd);
    }

}

class Student extends Person {
    String Course;
    int RollNo;

    Student(String name, String add, String course, int rn) {
        super(name, add);
        Course = course;
        RollNo = rn;
    }

    void display() {
        System.out.println("Name of the Student:" + Name);
        System.out.println("Address of the Student:" + Address);
        System.out.println("Course of the Student:" + Course);
        System.out.println("RollNo. of the Student:" + RollNo);
    }
}

public class sixteenth {
    public static void main(String[] args) {
        Person P1 = new Person("Sanjeet", "Laxmi Nagar");
        Teacher T1 = new Teacher("Amar", "Shahdara", "Arts", "south delhi");
        Student S1 = new Student("Vishnu", "Sarojni Nagr", "Geography", 48);

        Person P;
        P = P1;
        System.out.println("Inside the person class");
        P.display();
        System.out.println();

        P = T1;
        System.out.println("Inside the teacher class");
        P.display();
        System.out.println();

        P = S1;
        System.out.println("Inside the Student class");
        P.display();

    }
}
