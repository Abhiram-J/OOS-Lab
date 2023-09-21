import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import classes.StudentQ7;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();
        ArrayList<StudentQ7> arr = new ArrayList<StudentQ7>();

        System.out.println("Enter details (rollNumber, fullName, height, weight) separated by comma in each line");
        for ( int i = 0; i < n ; ++i){
            StudentQ7 st = new StudentQ7();
            st.readStudent(sc);
            arr.add(st);
        }
        Collections.sort(arr,(o1, o2) -> {
            return Integer.compare(o1.height,o2.height);
        });

        for ( int i = 0; i < n; ++i){
            arr.get(i).printStudentDetails();
        }
        sc.close();

    }

}
