import java.util.Scanner;

class Point {
    private Integer abscissa;
    private Integer ordinate;

    public Point(Integer abscissa, Integer ordinate) {
        this.abscissa = abscissa;
        this.ordinate = ordinate;
    }

    public static Point midpoint(Point point1, Point point2) {
        Integer midX = (point1.abscissa + point2.abscissa) / 2;
        Integer midY = (point1.ordinate + point2.ordinate) / 2;
        return new Point(midX, midY);
    }

    public String toString() {
        return String.format("%.2f,%.2f", (double) abscissa, (double) ordinate);
    }
}

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] point1Input = sc.nextLine().split(",");
        String[] point2Input = sc.nextLine().split(",");

        sc.close();

        if (point1Input.length != 2 || point2Input.length != 2) {
            System.out.println("INVALID");
        } else {
            Integer x1 = Integer.parseInt(point1Input[0]);
            Integer y1 = Integer.parseInt(point1Input[1]);
            Integer x2 = Integer.parseInt(point2Input[0]);
            Integer y2 = Integer.parseInt(point2Input[1]);

            Point point1 = new Point(x1, y1);
            Point point2 = new Point(x2, y2);

            Point midPoint = Point.midpoint(point1, point2);
            System.out.println(midPoint);
        }
    }
}
