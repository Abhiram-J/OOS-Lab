import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String direction = sc.next();
            int steps = sc.nextInt();

            try {
                if (direction.equals("Up")) {
                    rows -= steps;
                } else if (direction.equals("Down")) {
                    rows += steps;
                } else if (direction.equals("Left")) {
                    cols -= steps;
                } else if (direction.equals("Right")) {
                    cols += steps;
                }

            } catch (NumberFormatException e) {
                System.out.println("Invalid input");
            }
        }

        if (rows < 1 || rows > 8 || cols < 1 || cols > 8) {
            System.out.println("Overflow");
        } else {
            System.out.println("[" + rows + "," + cols + "]");

        }
        sc.close();
    }
}
