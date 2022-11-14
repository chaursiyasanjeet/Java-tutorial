import java.util.Scanner;

public class inputInJava {
    public static void main(String[] args) {
        // Input in java
        Scanner sc = new Scanner(System.in);
        System.out.println("input your age:");
        int age = sc.nextInt();
        System.out.println("age is: " + age);

        System.out.println("input your fullname:");
        String fullname = sc.nextLine();
        System.out.println(fullname);
    }
}
