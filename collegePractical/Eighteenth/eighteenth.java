import java.util.Scanner;

abstract class Shape {
    abstract public void area();

    double dimension1, dimension2;
}

class Rectangle extends Shape {
    int areOfRectangle;

    public void area() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of rectangle:");
        dimension1 = sc.nextInt();
        System.out.println("Enter the Breadth of rectangle:");
        dimension2 = sc.nextInt();
        System.out.println("Area of the  Rectangle is: " + (dimension1 * dimension2));
    }
}

class Triangle extends Shape {
    int areaOfTriangle;

    public void area() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Base of the Traingle:");
        dimension1 = sc.nextInt();
        System.out.println("Height of the  Triangle:");
        dimension2 = sc.nextInt();
        System.out.println("Area of the Triangle is: " + (0.5 * dimension1 * dimension2));
    }
}

public class eighteenth {
    public static void main(String[] args) {
        Rectangle R1 = new Rectangle();
        Triangle T1 = new Triangle();

        R1.area();
        System.out.println();
        T1.area();
    }
}
