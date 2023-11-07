import java.util.Scanner;

public class Q1 {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        if (b == 0) {
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            char operator = sc.nextLine().charAt(0);

            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            int num1 = Integer.parseInt(s1);
            int num2 = Integer.parseInt(s2);

            int result = 0;

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 == 0) {
                        throw new ArithmeticException(
                                "ArithmeticException: Division by zero handled. Enter a valid argument.");
                    }
                    result = num1 / num2;
                    break;
                default:
                    throw new IllegalArgumentException(
                            "IllegalArgumentException: Invalid operator. Supported operators are +, -, *, and /.");
            }

            System.out.println(result);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: Enter valid numeric arguments.");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}
