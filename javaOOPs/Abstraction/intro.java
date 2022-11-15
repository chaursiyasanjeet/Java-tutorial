abstract class Animal {
    abstract public void walk();

    public void eat() {
        System.out.println("animal eats");
    }

}

class Horse extends Animal {
    public void walk() {
        System.out.println("Walks on 4 legs");
    }
}

class Chicken extends Animal {
    public void walk() {
        System.out.println("Walks on 2 legs");
    }
}

public class intro {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk();
        horse.eat();
    }
}
