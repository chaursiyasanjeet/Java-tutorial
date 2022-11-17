import java.util.Scanner;

class Student {
    String Name;
    int RollNo;
    String Course;

    public void getData(String Name, int RollNo, String Course) {
        this.Name = Name;
        this.RollNo = RollNo;
        this.Course = Course;
    }

    public void displayData() {
        System.out.println("Name:" + Name);
        System.out.println("RollNo:" + RollNo);
        System.out.println("Course:" + Course);
    }

}

public class eleventh {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.getData("sanjeet", 45, "B.A. prog");
        s1.displayData();
    }
}