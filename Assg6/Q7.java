import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Person {
    protected String personName;
    protected int age;

    public Person(String personName, int age) {
        this.personName = personName;
        this.age = age;
    }

    public String getPersonName() {
        return personName;
    }
}

class Student extends Person {
    protected int rollNumber;
    protected double percentageOfMarks;

    public Student(String personName, int age, double percentageOfMarks) {
        super(personName, age);
        this.percentageOfMarks = percentageOfMarks;
    }

    public Double getPercentageOfMarks() {
        return percentageOfMarks;
    }
}

class PGStudent extends Student {
    private String elective;
    private int numberOfSubjects;

    public PGStudent(String personName, int age, double percentageOfMarks, String elective) {
        super(personName, age, percentageOfMarks);
        this.elective = elective;
    }

    public String getElective() {
        return elective;
    }

}

public class Q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        ArrayList<PGStudent> students = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(":");
            String name = input[0];
            int age = Integer.parseInt(input[1]);
            String elective = input[2];
            double percentage = Double.parseDouble(input[3]);

            PGStudent student = new PGStudent(name, age, percentage, elective);
            students.add(student);
        }

        Collections.sort(students, (s1,s2)->{
                return s2.getPercentageOfMarks().compareTo(s1.getPercentageOfMarks());
        });

        for (PGStudent student : students) {
            System.out.println(student.getPersonName());
        }
        scanner.close();
    }
}
