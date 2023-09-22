import java.util.Scanner;
import java.util.ArrayList;

class Circle {
    public Double radius;

    Circle(Double radius) {
        this.radius = radius;
    }

    public Double calculateArea() {
        return Math.PI * radius * radius;
    }

    public Double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle {
    public Double length;
    public Double breadth;

    Rectangle(Double length, Double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public Double calculateArea() {
        return length * breadth;
    }

    public Double calculatePerimeter() {
        return 2 * (length + breadth);
    }
}

class Square {
    public Double side;

    Square(Double side) {
        this.side = side;
    }

    public Double calculateArea() {
        return side * side;
    }

    public Double calculatePerimeter() {
        return 4 * side;
    }
}

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Object> shapes = new ArrayList<>();

        System.out.print("Enter the number of shapes: ");
        int numShapes = sc.nextInt();

        for (int i = 0; i < numShapes; i++) {
            System.out.print("Enter 1 for Circle, 2 for Rectangle, 3 for Square: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.println("Enter the radius: ");
                Double radius = sc.nextDouble();
                Circle circle = new Circle(radius);
                System.out.println(String.format("The Area is %.2f and the Perimeter is %.2f", circle.calculateArea(),
                        circle.calculatePerimeter()));
                shapes.add(circle);
            } else if (choice == 2) {
                System.out.println("Enter the length and breadth: ");
                Double length = sc.nextDouble();
                Double breadth = sc.nextDouble();
                Rectangle rectangle = new Rectangle(length, breadth);
                System.out.println(String.format("The Area is %.2f and the Perimeter is %.2f",
                        rectangle.calculateArea(), rectangle.calculatePerimeter()));
                shapes.add(rectangle);
            } else if (choice == 3) {
                System.out.println("Enter the side: ");

                Double side = sc.nextDouble();
                Square square = new Square(side);
                System.out.println(String.format("The Area is %.2f and the Perimeter is %.2f", square.calculateArea(),
                        square.calculatePerimeter()));
                shapes.add(square);
            }
        }

        System.out.print("Enter the threshold value: ");
        Double threshold = sc.nextDouble();

        System.out.println("The shapes are:");
        for (Object shape : shapes) {
            if (shape instanceof Circle) {
                Circle circle = (Circle) shape;
                Double area = circle.calculateArea();
                if (area > threshold) {
                    System.out.println("Circle(" + circle.radius + ")");
                }
            } else if (shape instanceof Rectangle) {
                Rectangle rectangle = (Rectangle) shape;
                Double area = rectangle.calculateArea();
                if (area > threshold) {
                    System.out.println("Rectangle(" + rectangle.length + "," + rectangle.breadth + ")");
                }
            } else if (shape instanceof Square) {
                Square square = (Square) shape;
                Double area = square.calculateArea();
                if (area > threshold) {
                    System.out.println("Square(" + square.side + ")");
                }
            }
        }
        sc.close();
    }
}
