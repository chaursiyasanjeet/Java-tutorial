import java.util.Scanner;

public class fourth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // taking inputs of number
        System.out.println("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the Second number: ");
        int num2 = sc.nextInt();
        System.out.println("Enter the Third number: ");
        int num3 = sc.nextInt();

        // maximum of three using if else
        if (num1 == num2 && num2 == num3) {
            System.out.println("Numbers are equal.");
        } else if (num1 > num2 && num1 > num3) {
            System.out.println("Maximum form the numbers is: " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("Maximum from the numers is:" + num2);
        } else {
            System.out.println("Maximum from the numers is:" + num3);
        }

        // using ternary operator
        int max = (num1 > num2) ? (num1 > num3 ? num1 : num3) : (num2 > num3 ? num2 : num3);

        System.out.println("Using ternary operator:-");
        System.out.println("Maximum from the numbers is: " + max);
    }

}
