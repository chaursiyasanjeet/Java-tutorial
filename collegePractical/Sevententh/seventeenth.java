import java.util.Scanner;

class Circle {
    double radius;

    Circle(double r) {
        this.radius = r;
    }

    void area() {
        System.out.println("Area of the Circle is :" + (3.14 * radius * radius));
    }
}

class Cylinder extends Circle {
    double height;

    Cylinder(double r, double h) {
        super(r);
        this.height = h;
    }

    void area() {
        System.out.println("Area of the cylinder is: " + (2 * 3.14 * radius * (radius + height)));
    }
}

public class seventeenth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // creating object

        System.out.println("Enter the radius");
        double r = sc.nextInt();
        System.out.println("Enter the height");
        double h = sc.nextInt();

        Circle circle1 = new Circle(r);
        Cylinder cylinder1 = new Cylinder(r, h);

        System.out.println();
        circle1.area();
        cylinder1.area();
        System.out.println();
    }
}
