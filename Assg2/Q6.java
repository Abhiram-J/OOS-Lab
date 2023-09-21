import java.util.Scanner;
import classes.StudentQ6;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();

        System.out.print("Enter Student Details: ");
        for ( int i = 0; i < n ; ++i){
            String name = sc.next();
            String rollNo = sc.next();
            Double CGPA = sc.nextDouble();
            StudentQ6 st = new StudentQ6(name, rollNo, CGPA);
            System.out.println(name + " " + rollNo + " " + CGPA + " " + st.getPercentage() + '%');

        }
        sc.close();

    }
    
}
