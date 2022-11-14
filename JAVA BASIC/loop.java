import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
        // LOOPS

        // for loop
        /*
         * System.out.println("printing in  for loop");
         * int k = 100;
         * for (int i = 0; i < 101; i++) {
         * System.out.println(i);
         * }
         * 
         * // while loop
         * System.out.println("printing in  while loop");
         * int k = 100;
         * int i = 100;
         * while (i >= 1) {
         * System.out.println(i);
         * i--;
         * 
         * }
         * 
         * // do while loop
         * System.out.println("printing in do while loop");
         * int k = 100;
         * do {
         * System.out.println(k);
         * k = k - 1;
         * } while (k >= 1);
         */
        Scanner sc = new Scanner(System.in);
        int number = 0;

        do {
            System.out.println("input a number");
            number = sc.nextInt();
            System.out.println("Here is your number" + number);
        } while (number >= 0);

        System.out.println("THE END!!");
    }
}
