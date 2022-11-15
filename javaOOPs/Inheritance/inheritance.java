import bank.*;

class Shape {
    public void area() {
        System.out.println("display area");
    }

}

// single level inheritance
class Triangle extends Shape {
    public void area(int l, int h) {
        System.out.println(1 / 2 * l * h);
    }
}

// multi level inheritance
class EquilateralTriangle extends Triangle {
    public void area(int l, int h) {
        System.out.println(1 / 2 * l * h);
    }
}

// hierarchial Inheritance->multiple subcalss fromm 1 base class
class Circle extends Shape {
    public void ares(int r) {
        System.out.println((3.14) * r * r);
    }
}

// hybrid inheritance->different inheritance in same branch

public class inheritance {
    public static void main(String[] args) {
        bank.Account account1 = new bank.Account();
        account1.name = "Sanjeet";
    }
}
