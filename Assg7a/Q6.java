import java.util.ArrayList;
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        ArrayList<Integer> queue = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String op = sc.next();
            if (op.equals("E")) {
                int num = sc.nextInt();
                queue.add(num);
                System.out.println("Success");
            } else if (op.equals("D")) {
                if (!queue.isEmpty()) {
                    int dequeuedElement = queue.remove(0);
                    System.out.println(dequeuedElement);
                } else {
                    System.out.println("EmptyQueue");
                }
            }
        }
        sc.close();
    }
}
