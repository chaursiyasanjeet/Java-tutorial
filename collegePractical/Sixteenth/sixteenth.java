import java.util.Scanner;

class Person {
    Scanner sc = new Scanner(System.in);

    Person() {
        System.out.println("Enter the Person name:");
        String name = sc.nextLine();

    }
}

class Teacher extends Person {
    Teacher(Person P1) {
        this.name = P1.name;
    }
}

class Student extends Person {

}

public class sixteenth {
    public static void main(String[] args) {
        Person P1 = new Person();
        Person P2 = new Person();
        Person P3 = new Person();
        Person P4 = new Person();

        Teacher T1 = new Teacher(P1);

    }
}
