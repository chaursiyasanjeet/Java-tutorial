import java.util.Scanner;

public class seventh {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();

        int a = 0, b = 1;
        int ans = 0;
        System.out.println("Fibonnaci Series is:");
        if (n < 3) {
            System.out.println(+a);
            System.out.println(+b);
        } else {
            System.out.println(+a);
            System.out.println(+b);
            for (int i = 3; i <= n; i++) {
                ans = a + b;
                a = b;
                b = ans;
                System.out.println(+ans);
            }
        }
    }
}
