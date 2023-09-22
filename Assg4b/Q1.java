import java.util.Scanner;

class Student {
    private String name;
    private String rollNo;
    private Double CGPA;

    public Student(String name, String rollNo, Double CGPA) {
        this.name = name;
        this.rollNo = rollNo;
        this.CGPA = CGPA;
    }

    public Double getPercentage() {
        return 9.5 * CGPA;
    }

    public String getName() {
        return name;
    }

    public String getRollNo() {
        return rollNo;
    }

    public Double getCGPA() {
        return CGPA;
    }

}

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();

        System.out.print("Enter Student Details: ");
        for (int i = 0; i < n; ++i) {
            String name = sc.next();
            String rollNo = sc.next();
            Double CGPA = sc.nextDouble();
            Student st = new Student(name, rollNo, CGPA);
            System.out
                    .println(st.getName() + " " + st.getRollNo() + " " + st.getCGPA() + " " + st.getPercentage() + '%');

        }
        sc.close();

    }

}
