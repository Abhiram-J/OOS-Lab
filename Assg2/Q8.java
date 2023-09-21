import java.util.ArrayList;
import java.util.Scanner;

import classes.Train;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Train> arr = new ArrayList<Train>();

        while (true) {

            System.out.println("1-Add details");
            System.out.println("2-Show details");
            System.out.println("3-Exit");
            System.out.println("Enter choice :");

            int c = sc.nextInt();
            if (c == 1) {
                System.out.println("Enter bus details(Busno, from, to, distance, type)");
                Integer busNo = sc.nextInt();
                String from = sc.next();
                String to = sc.next();
                Integer distance = sc.nextInt();
                String type = sc.nextLine();
                System.out.println(type.length());
                if ( type.length() == 0) type = "O";
                else type = type.substring(1, type.length());
                Train t = new Train(busNo, from, to, distance, type);
                t.calcFare();
                arr.add(t);

            } else if (c == 2) {
                System.out.println("Bus details(Busno, from, to, distance, type, fare)");
                for (Train t : arr) {
                    System.out.println(t.busNo + " " + t.from + " " + t.to + " " + t.distance + " " + t.type + " " + t.fare);
                }
                System.out.println();
            } else {
                break;
            }


        }

        sc.close();

    }

}
