import java.util.Scanner;

class Room {
    int length;
    int breadth;
    int height;

    Room() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of room:");
        length = sc.nextInt();
        System.out.println("Enter the breadth of room:");
        breadth = sc.nextInt();
        System.out.println("Enter the height of room:");
        height = sc.nextInt();
    }

    Room(int value) {
        this.length = value;
        this.breadth = value;
        this.height = value;
    }

    Room(int l, int b, int h) {
        this.length = l;
        this.breadth = b;
        this.height = h;
    }

    public void roomDimension() {
        System.out.println("Length of the room:" + this.length);
        System.out.println("Breadth of the room:" + this.breadth);
        System.out.println("Height of the room:" + this.height);
    }
}

public class tweleveth {
    public static void main(String[] args) {
        Room room1 = new Room();

        System.out.println();
        System.out.println("Printing details of room1");
        room1.roomDimension();
        System.out.println();

        Room room2 = new Room(5);
        System.out.println("Printing details of room2");
        room2.roomDimension();
        System.out.println();

        Room room3 = new Room(8, 5, 6);
        System.out.println("Printing details of room3");
        room3.roomDimension();
        System.out.println();
    }
}
