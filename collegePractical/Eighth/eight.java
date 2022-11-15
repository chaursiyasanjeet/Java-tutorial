import java.util.Scanner;

public class eight {
    public static int fact(int n) {
        int fact = 1;
        // computing the factorial of number
        for (int i = n; i > 0; i--) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n:");
        int n = sc.nextInt();
        System.out.println("Enter the value of x:");
        int x = sc.nextInt();

        System.out.println();
        System.out.println("Factorial of the number is: " + fact(n));

        // computing the sum of series
        double sum = 0;
        for (int i = 0; i <= n; i++) {
            sum = sum + (Math.pow(x, i) / fact(i));
        }
        System.out.println("Sum of the series is: " + sum);

    }
}