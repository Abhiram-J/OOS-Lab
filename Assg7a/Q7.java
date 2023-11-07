import java.util.Scanner;

public class Q7 {
    public static long hexToDecimal(String hex) throws Exception {

        hex = hex.toUpperCase();
        long decimalValue = 0;
        for (int i = 0; i < hex.length(); i++) {
            char digit = hex.charAt(i);
            if (isHexDigit(digit)) {
                int value = Character.isDigit(digit) ? digit - '0' : digit - 'A' + 10;
                decimalValue = decimalValue * 16 + value;
            } else {
                throw new Exception("InvalidHexdecimal");
            }
        }
        return decimalValue;
    }

    public static boolean isHexDigit(char digit) {
        return (digit >= '0' && digit <= '9') || (digit >= 'A' && digit <= 'F');
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            String hexadecimalValue = sc.next();
            long decimalValue = hexToDecimal(hexadecimalValue);
            System.out.println(decimalValue);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }

}
