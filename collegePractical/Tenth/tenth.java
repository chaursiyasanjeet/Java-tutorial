import java.util.Scanner;
import java.util.Arrays;

public class tenth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of Elements in Array:");
        int n = sc.nextInt();
        int arr[] = new int[n];

        // taking input in arrray
        System.out.println("Enter the numbers:-");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println();
        // sorting array
        Arrays.sort(arr);
        // printing the array
        System.out.println("After sorting:-");
        for (int i = 0; i < n; i++) {
            System.out.print(+arr[i] + " ");
        }
    }

}