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