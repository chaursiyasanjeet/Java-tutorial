import java.util.Arrays;
import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        // ARRAYS
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] marks = new int[n];
        marks[0] = 98;
        marks[1] = 89;
        marks[2] = 78;
        System.out.println(marks[0]);

        // length
        System.out.println(marks.length);
        // sort array
        System.out.println(marks[0]);
        Arrays.sort(marks);
        System.out.println(marks[0]);

        int[] marks2 = { 89, 49, 93, 493 };

        int[][] finalMarks = { { 97, 98, 59 }, { 89, 49, 94 } };
        System.out.println(finalMarks[1][1]);

    }
}
