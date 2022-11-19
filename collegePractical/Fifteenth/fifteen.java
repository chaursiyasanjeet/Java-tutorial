class Employee {
    private String EmpId;
    static final String CompanyName = "Sanjeet";
    static int noOfEmployee;

    Employee() {
        noOfEmployee++;
    }

    // method for displaying No of employees
    public static void display() {
        System.out.println("No. of employees is:" + noOfEmployee);
    }
}

public class fifteen {
    public static void main(String[] args) {
        // creating employee objects
        Employee E1 = new Employee();
        Employee E2 = new Employee();
        Employee E3 = new Employee();
        Employee E4 = new Employee();
        Employee E5 = new Employee();
        Employee E6 = new Employee();
        Employee E7 = new Employee();
        Employee E8 = new Employee();
        Employee E9 = new Employee();

        System.out.println();
        Employee.display();
        System.out.println();
    }
}