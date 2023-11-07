import java.util.Scanner;

interface Shape {
    void draw();
}

class Circle implements Shape {
    public void draw() {
        System.out.println("Drawing a Circle...");
    }
}

class Rectangle implements Shape {
    public void draw() {
        System.out.println("Drawing a Rectangle...");
    }
}

class Triangle implements Shape {
    public void draw() {
        System.out.println("Drawing a Triangle...");
    }
}

class ShapeFactory {
    public Shape createShape(String shapeType) {
        switch (shapeType.toLowerCase()) {
            case "circle":
                return new Circle();
            case "rectangle":
                return new Rectangle();
            case "triangle":
                return new Triangle();
            default:
                return null;
        }
    }
}

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ShapeFactory shapeFactory = new ShapeFactory();
        System.out.println("Enter shape type: ");
        String userInput = sc.next();

        Shape shape = shapeFactory.createShape(userInput);

        if (shape != null) {
            shape.draw();
        } else {
            System.out.println("Invalid shape type !!!");
        }
        sc.close();
    }
}
