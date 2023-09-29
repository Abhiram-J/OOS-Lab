import java.util.Scanner;

class BitwiseAND {
    public int bitwiseAnd(int num1, int num2) {
        return num1 & num2;
    }

    public int bitwiseAnd(int num1, int num2, int num3) {
        return num1 & num2 & num3;
    }
}

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] numbers = scanner.nextLine().split(" ");

        int num1 = Integer.parseInt(numbers[0]);
        int num2 = Integer.parseInt(numbers[1]);

        BitwiseAND bitwiseAND = new BitwiseAND();

        if (numbers.length == 2) {
            int result1 = bitwiseAND.bitwiseAnd(num1, num2);
            System.out.println(result1);
        } else if (numbers.length == 3) {
            int num3 = Integer.parseInt(numbers[2]);
            int result2 = bitwiseAND.bitwiseAnd(num1, num2, num3);
            System.out.println(result2);
        }

        scanner.close();
    }
}
