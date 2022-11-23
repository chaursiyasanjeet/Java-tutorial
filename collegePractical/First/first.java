import java.util.Scanner;

public class first {

    public static void main(String[] args) {
        // input scanner hai
        Scanner sc = new Scanner(System.in);

        // taking input of first number
        System.out.println("Enter the first number");
        double num1 = sc.nextInt();

        // taking input of second number
        System.out.println("Enter the Second number");
        double num2 = sc.nextInt();

        // operations
        double sum = num1 + num2;
        double diff = 0;
        double multiply = num1 * num2;
        double divide = (num1 / num2);

        if (num1 > num2) {
            diff = num1 - num2;
        } else {
            diff = num2 - num1;
        }

        System.out.println("Sum is:" + sum);
        System.out.println("Difference is:" + diff);
        System.out.println("Product is:" + multiply);
        System.out.println("Quotient is:" + divide);

    }

}
