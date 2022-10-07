import java.util.Arrays;

public class array {
    public static void main(String[] args) {
        // ARRAYS
        int[] marks = new int[3];
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
