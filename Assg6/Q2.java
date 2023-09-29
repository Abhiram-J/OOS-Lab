import java.util.Scanner;

class AreaCalculator {
    public double calculateArea(int radius) {
        return Math.PI * radius * radius;
    }

    public double calculateArea(int length, int breadth) {
        return length * breadth;
    }

    public double calculateArea(int a, int b, int c) {
        double s = (a + b + c) / 2.0;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}

public class Q2 {
    public static void main(String[] args) {
        AreaCalculator areaCalculator = new AreaCalculator();

        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");

        if (input.length == 1) {
            int radius = Integer.parseInt(input[0]);
            double circleArea = areaCalculator.calculateArea(radius);
            System.out.println(String.format("Circle:%.2f", circleArea));
        } else if (input.length == 2) {
            int length = Integer.parseInt(input[0]);
            int breadth = Integer.parseInt(input[1]);
            double rectangleArea = areaCalculator.calculateArea(length, breadth);
            System.out.println(String.format("Rectangle:%.2f", rectangleArea));
        } else if (input.length == 3) {
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);
            int c = Integer.parseInt(input[2]);
            double triangleArea = areaCalculator.calculateArea(a, b, c);
            System.out.println(String.format("Triangle:%.2f", triangleArea));
        }

        scanner.close();
    }
}
