import java.util.ArrayList;
import java.util.Scanner;

class Student {
    public String studentName;
    public Integer rollNo;
    public Integer englishScore;
    public Integer hindiScore;
    public Integer mathsScore;
    public Integer scienceScore;
    public Integer ssScore;
    public Integer totalScore;

    public Student(String studentName, Integer rollNo, Integer englishScore, Integer hindiScore, Integer mathsScore, Integer scienceScore, Integer ssScore) {
        this.studentName = studentName;
        this.rollNo = rollNo;
        this.englishScore = englishScore;
        this.hindiScore = hindiScore;
        this.mathsScore = mathsScore;
        this.scienceScore = scienceScore;
        this.ssScore = ssScore;
        this.totalScore = englishScore + hindiScore + mathsScore + scienceScore + ssScore;
    }

}

public class Q8{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        while (true) {
            char operation = sc.next().charAt(0);

            if (operation == 'a') {
                String studentName = sc.next(); 
                Integer rollNo = sc.nextInt(); 
                Integer englishScore = sc.nextInt(); 
                Integer hindiScore = sc.nextInt(); 
                Integer mathsScore = sc.nextInt(); 
                Integer scienceScore = sc.nextInt(); 
                Integer ssScore = sc.nextInt(); 

                students.add(new Student(studentName, rollNo, englishScore, hindiScore, mathsScore, scienceScore, ssScore));
            } else if (operation == 's') {
                Integer subjectCode = sc.nextInt(); 
                findSubjectTopper(students, subjectCode);
            } else if (operation == 'c') {
                findClassTopper(students);
            } else if (operation == 't') {
                break;
            }
        }

        sc.close();
    }

    public static void findSubjectTopper(ArrayList<Student> students, int subjectCode) {
        Integer maxScore = 0; 
        ArrayList<Student> subjectToppers = new ArrayList<>();

        for (Student student : students) {
            Integer subjectScore = 0;

            switch (subjectCode) {
                case 101:
                    subjectScore = student.englishScore;
                    break;
                case 102:
                    subjectScore = student.hindiScore;
                    break;
                case 103:
                    subjectScore = student.mathsScore;
                    break;
                case 104:
                    subjectScore = student.scienceScore;
                    break;
                case 105:
                    subjectScore = student.ssScore;
                    break;
                default:
                    break;
            }

            if (subjectScore > maxScore) {
                maxScore = subjectScore;
                subjectToppers.clear();
                subjectToppers.add(student);
            } else if (subjectScore == maxScore) {
                subjectToppers.add(student);
            }
        }

        for (Student topper : subjectToppers) {
            System.out.println(topper.studentName+ " " + topper.rollNo);
        }
    }

    public static void findClassTopper(ArrayList<Student> students) {
        Integer maxTotalScore = 0;
        ArrayList<Student> classToppers = new ArrayList<>();

        for (Student student : students) {
            Integer totalScore = student.totalScore;

            if (totalScore > maxTotalScore) {
                maxTotalScore = totalScore;
                classToppers.clear();
                classToppers.add(student);
            } else if (totalScore == maxTotalScore) {
                classToppers.add(student);
            }
        }

        for (Student topper : classToppers) {
            System.out.println(topper.studentName+ " " + topper.rollNo);
        }
    }
}
