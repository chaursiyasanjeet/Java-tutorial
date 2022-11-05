import java.util.Scanner;

public class eigth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        int fact = 1;
        int s = 0;

        // computing the factorial of number
        for (int i = num; i > 0; i--) {
            fact = fact * i;
            s = s + fact;
        }
        System.out.println("Factorial of the number is:" + fact);
        System.out.println("Sum of the series is:" + s);
    }
}