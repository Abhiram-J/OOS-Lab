import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            String temp = sc.nextLine();
            String[] indexStrings = sc.nextLine().split(" ");
            int sum = 0;

            for (int i = 0; i < indexStrings.length; i++) {
                int index = Integer.parseInt(indexStrings[i]);
                sum += arr[index];
            }

            System.out.println(sum);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException. Enter valid index.");
        }
        sc.close();
    }
}
