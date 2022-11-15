import java.util.Scanner;

public class fifth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();

        System.out.println();
        switch (1) {

            // checking number is even or odd
            case 1:
                if (num % 2 == 0) {
                    System.out.println("Numer is even");
                } else {
                    System.out.println("Number is odd");
                }

                // checking number is prime or not
            case 2:
                boolean isPrime = true;
                if (num < 2 & num >= 0) {
                    System.out.println("Not a prime number");
                    break;
                }

                for (int i = 2; i < num; i++) {
                    if (num % i == 0) {
                        isPrime = false;
                    }
                }
                if (isPrime) {
                    System.out.println("Number is a prime number");
                } else {
                    System.out.println("Number is not a prime number");
                }

        }

    }
}
