import java.util.Scanner;

public class sixth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();

        switch (1) {
            // sum of digits of number.
            case 1:
                int sum = 0;
                int numc = num;
                while (numc != 0) {
                    int digit = numc % 10;
                    sum += digit;
                    numc = numc / 10;
                }
                System.out.println("Sum of the digit of numbers is: " + sum);
            case 2:
                int reverseNumber = 0;
                while (num != 0) {
                    reverseNumber = reverseNumber * 10;
                    reverseNumber = reverseNumber + (num % 10);
                    num = num / 10;

                }
                System.out.println("Reverse of the number is: " + reverseNumber);
        }
    }
}
