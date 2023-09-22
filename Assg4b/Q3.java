import java.util.Scanner;

class Engine {
    String engine_no;
    Integer cc;

    Engine(String engine_no, Integer cc) {
        this.engine_no = engine_no;
        this.cc = cc;
    }
}

class Car {
    Engine engine;
    String color;
    Integer price;

    Car(String engine_no, Integer cc, String color, Integer price) {
        this.engine = new Engine(engine_no, cc);
        this.color = color;
        this.price = price;
    }

    public String toString() {
        return engine.engine_no + " " + engine.cc + " " + color + " " + price;
    }
}

public class Q3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter car details:");
        String engine_no = sc.next();
        Integer cc = sc.nextInt();
        String color = sc.next();
        Integer price = sc.nextInt();

        Car car = new Car(engine_no,cc, color, price);

        System.out.println(car);

        sc.close();
    }
}
