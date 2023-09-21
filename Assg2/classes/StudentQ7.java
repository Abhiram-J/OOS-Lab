package classes;

import java.util.Scanner;

public class StudentQ7 {
    public String fullName;
    public String rollNumber;
    public Integer height;
    public Integer weight;

    public void readStudent(Scanner sc) {
        String rollNo = sc.next();
        String firstname = sc.next();
        String lastName = sc.next();

        String tempHeight = sc.next();
        String tempWeight = sc.next();

        rollNumber = rollNo.substring(0, rollNo.length() - 1);
        fullName = firstname + " " + lastName.substring(0, lastName.length() - 1);
        height = Integer.parseInt(tempHeight.substring(0, tempHeight.length() - 3));
        weight = Integer.parseInt(tempWeight.substring(0, tempWeight.length() - 2));
    }

    public void printStudentDetails() {
        System.out.println(rollNumber + ", " + fullName + ", " + height + "cm, " + weight + "Kg");
    }
}
