import java.util.Scanner;
import java.util.Arrays;

public class ninth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size");
        int n = sc.nextInt();
        int arr[] = new int[n];

        // taking inputs in array
        System.out.println("Enter the array Elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println();
        // sum of Arrays
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        System.out.println("Sum of arrays is:" + sum);

        // average of arrays
        double average = (sum / n);
        System.out.println("Average of arrays element is:" + average);
    }
}
