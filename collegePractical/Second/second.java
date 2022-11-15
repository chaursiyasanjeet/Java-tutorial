import java.util.Scanner;

public class second {

    // square method
    public static int square(int num) {
        return num * num;

    }

    // cube method
    public static int cube(int num) {
        return num * num * num;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int num = sc.nextInt();
        System.out.println();
        System.out.println("Square of the number is:" + square(num));
        System.out.println("Cube of the number is:" + cube(num));
    }
}
