public class fourteenth {
    public static void area(int r) {
        double a = 3.14 * r * r;
        System.out.println("Area of circle with radius " + r + " is : " + a);
    }

    public static void area(int length, int breadth) {
        double a = length * breadth;
        System.out.println("Area of Rectangle with length " + length + " and breadth " + breadth + " is: " + a);
    }

    public static void area(int a, int b, int c) {
        double temp = (a + b + c);
        double s = temp / 2;
        double traingleArea = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println(
                "Area of triangle with length of sides  " + a + "," + b + " and " + c + " is : " + traingleArea);
    }

    public static void main(String[] args) {
        area(5);
        area(4, 5);
        area(5, 8, 9);
    }
}
