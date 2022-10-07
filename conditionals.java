import java.util.Scanner;

public class conditionals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cash value");

        // pen- 10rs and book - 40rs
        int cash = sc.nextInt();
        if (cash < 10) {
            System.out.println("can not buy anything");
            System.out.println("get more cash!!");
        } else if (cash > 10 && cash < 40) {
            System.out.println("you can buy pen");
        } else {
            System.out.println("You can buy both");
        }

        // Switch
        System.out.println("enter the day value");
        int day = sc.nextInt();// 1-monday; 2-tuesday

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesdya");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("You have entered the wrong value");
        }
    }
}
