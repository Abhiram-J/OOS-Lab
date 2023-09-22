import java.util.Scanner;

class Operations {
    public Integer add(Integer num1, Integer num2) {
        return num1 + num2;
    }

    public Integer add(Integer num1, Integer num2, Integer num3) {
        return num1 + num2 + num3;
    }

    public Integer negate(Integer num) {
        return -num;
    }
}

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Operations operations = new Operations();

        while (true) {
            System.out.println();
            System.out.println("1. Add two numbers");
            System.out.println("2. Add three numbers");
            System.out.println("3. -1 * number");
            System.out.println("4. Exit");
            System.out.print("Enter option: ");

            Integer option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Enter 2 numbers: ");
                    Integer num1 = sc.nextInt();
                    Integer num2 = sc.nextInt();
                    Integer sum1 = operations.add(num1, num2);
                    System.out.println("Sum is " + sum1);
                    break;

                case 2:
                    System.out.print("Enter 3 numbers: ");
                    Integer num3 = sc.nextInt();
                    Integer num4 = sc.nextInt();
                    Integer num5 = sc.nextInt();
                    Integer sum2 = operations.add(num3, num4, num5);
                    System.out.println("Sum is " + sum2);
                    break;

                case 3:
                    System.out.print("Enter a number: ");
                    Integer num6 = sc.nextInt();
                    Integer negated = operations.negate(num6);
                    System.out.println("Result is " + negated);
                    break;
                case 4:

                    sc.close();
                    return;

                default:
                    System.out.println("Invalid option. Please enter a valid option.");
                    break;
            }
        }

    }
}
