import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.next();
        int length = input.length();
        String packetLengthBinary = input.substring(0, 8);
        int packetLength = Integer.parseInt(packetLengthBinary, 2);
        if (length % 8 == 0) {
            StringBuilder message = new StringBuilder();

            for (int i = 8; i < length; i += 8) {
                String byteBinary = input.substring(i, i + 8);
                int decodedByte = Integer.parseInt(byteBinary, 2) ^ packetLength;
                char character = (char) decodedByte;
                message.append(character);
            }

            System.out.println(message.toString());
        } else {
            System.out.println("Incorrect Input");
        }
        sc.close();
    }
}
