import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the inmate details: ");
        String name = sc.next();
        String role = sc.next();
        String food = sc.next();

        System.out.print("Enter the number of days: ");
        int days = sc.nextInt();
        boolean v = food.charAt(0) == 'v';
        boolean e = role.charAt(0) == 'e';
        int cost = (e ? (v ? days*105 : days*126) : (v ? days*100: days*120 ));

        System.out.println(cost);
        sc.close();

    }
    
}
