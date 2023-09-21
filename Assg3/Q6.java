import classes.StudentData;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

 class StudentDataExtended extends StudentData {
    private String location;
    private static ArrayList<StudentDataExtended> studentList = new ArrayList<>();

    public StudentDataExtended(String id, String name, String location) {
        super(id, name);
        this.location = location;
    }

    public static void addDetails(StudentDataExtended st) {
        studentList.add(st);
    }

    public static void printDetails() {
        Collections.sort(studentList, (o1,o2)->{
            return o1.getId().compareTo(o2.getId());
        });

        System.out.println("The Student Details are:");
        for (StudentDataExtended student : studentList) {
            System.out.println(student.getId() + " " + student.getName() + " " + student.location);
        }
    }
}

public class Q6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the details of Student " + i  + 1 + " (id, name, location):");
            String id = sc.next();
            String name = sc.next();
            String location = sc.next();
           StudentDataExtended st = new StudentDataExtended(id, name, location); 
           StudentDataExtended.addDetails(st);
        }

        StudentDataExtended.printDetails();

        sc.close();
    }
}
