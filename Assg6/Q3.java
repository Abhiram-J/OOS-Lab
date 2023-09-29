import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Student {
    public String name;
    public int rollNo;
    public int height;

    public Student(String name, int rollNo, int height) {
        this.name = name;
        this.rollNo = rollNo;
        this.height = height;
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                ", height=" + height +
                '}';
    }
}

public class Q3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        List<Student> students = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String input = scanner.next();
            input = input.substring(1, input.length() - 1);
            String[] details = input.split(",");
            String name = details[0];
            int rollNo = Integer.parseInt(details[1]);

            int height = Integer.parseInt(details[2]);

            Student student = new Student(name, rollNo, height);
            students.add(student);
        }
        Collections.sort(students, (s1, s2) -> {
            if (s1.height == s2.height) {
                return s2.name.compareTo(s1.name);
            }
            return s1.height - s2.height;
        });

        int k = scanner.nextInt();

        System.out.println(k);

        List<Student> selectedStudents = students.subList(Math.max(0, students.size() - k), students.size());

        for (int i = 0; i < selectedStudents.size(); i++) {
            if (i != selectedStudents.size() - 1) {
                System.out.print(selectedStudents.get(i).name + ",");
            } else {
                System.out.println(selectedStudents.get(i).name);
            }
        }

        scanner.close();
    }
}
