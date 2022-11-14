import java.util.Scanner;

public class miniProject {

    public static void main(String[] args) {
        // project
        int random = (int) (Math.random() * 100);
        Scanner sc = new Scanner(System.in);
        int num = 0;
        System.out.println("Guess the number");
        while (num >= 0) {
            num = sc.nextInt();
            if (num > random) {
                System.out.println("Number is too large");
                System.out.println("Please try again");

            } else if (num < random) {
                System.out.println("Number is too less");
                System.out.println("Please try again");

            } else {
                System.out.println("You got it right!!!");
                System.out.println("You win the game");
                break;

            }

        }
        System.out.println("random number was:" + random);
    }

}
