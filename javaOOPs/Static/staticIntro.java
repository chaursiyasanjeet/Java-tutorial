class Student {
    String name;
    static String school;

    public static void changeSchool() {
        school = "newschool";
    }
}

public class staticIntro {
    public static void main(String[] args) {
        Student.school = "Arya vidapith";
        Student student1 = new Student();
        student1.name = "Sanjeet";
        System.out.println(student1.school);

    }
}
