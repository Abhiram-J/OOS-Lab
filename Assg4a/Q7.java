import java.util.Scanner;

class Angle {
    private Integer degrees;
    private Integer minutes;

    public Angle(Integer degrees, Integer minutes) {
        this.degrees = degrees;
        this.minutes = minutes;
    }

    public static Angle angleSum(Angle angle1, Angle angle2) {
        Integer totalDegrees = angle1.degrees + angle2.degrees;
        Integer totalMinutes = angle1.minutes + angle2.minutes;

        if (totalMinutes >= 60) {
            totalDegrees += totalMinutes / 60;
            totalMinutes %= 60;
        }

        return new Angle(totalDegrees, totalMinutes);
    }

    public String toString() {
        return degrees + " " + minutes;
    }
}

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Integer degrees1 = sc.nextInt();
        Integer minutes1 = sc.nextInt();

        Integer degrees2 = sc.nextInt();

        Integer minutes2 = sc.nextInt();

        sc.close();

        Angle angle1 = new Angle(degrees1, minutes1);
        Angle angle2 = new Angle(degrees2, minutes2);

        Angle sum = Angle.angleSum(angle1, angle2);
        System.out.println(sum);
    }
}
