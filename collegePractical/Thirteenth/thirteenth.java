class Student {

    private int RollNo;
    private String Name;
    private int Marks1;
    private int Marks2;
    private int Marks3;

    // constructor
    Student(String Name, int RollNo, int Marks1, int Marks2, int Marks3) {
        this.Name = Name;
        this.RollNo = RollNo;
        this.Marks1 = Marks1;
        this.Marks2 = Marks2;
        this.Marks3 = Marks3;
    }

    public double calculatePercentage() {
        double totalMarks = Marks1 + Marks2 + Marks3;
        double percentage = (totalMarks / 300) * 100;
        return percentage;
    }

    public String calculateDivision() {
        if (calculatePercentage() > 60) {
            return "Ist Div";
        }
        if (50 < calculatePercentage() && calculatePercentage() < 60) {
            return "IInd Div";
        } else {
            return "IIIrd Div";
        }
    }

    public void displayMarksheet() {
        System.out.println("Displaying Student data");
        System.out.println("Name:" + Name);
        System.out.println("RollNo:" + RollNo);
        System.out.println("Marks1:" + Marks1);
        System.out.println("Marks2:" + Marks2);
        System.out.println("Marks3:" + Marks3);
        System.out.println("Percentage:" + calculatePercentage());
        System.out.println("Division:" + calculateDivision());
    }

}

public class thirteenth {
    public static void main(String[] args) {
        Student S1 = new Student("Sanjeet Kumar", 45, 85, 90, 94);
        System.out.println();
        S1.displayMarksheet();
    }
}
