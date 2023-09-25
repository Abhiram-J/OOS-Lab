abstract class Marks {
    abstract double getPercentage();
}

class A extends Marks {
    private int subject1, subject2, subject3;

    public A(int marks1, int marks2, int marks3) {
        this.subject1 = marks1;
        this.subject2 = marks2;
        this.subject3 = marks3;
    }

    double getPercentage() {
        return (subject1 + subject2 + subject3) / 3.0;
    }
}

class B extends Marks {
    private int subject1, subject2, subject3, subject4;

    public B(int marks1, int marks2, int marks3, int marks4) {
        this.subject1 = marks1;
        this.subject2 = marks2;
        this.subject3 = marks3;
        this.subject4 = marks4;
    }

    double getPercentage() {
        return (subject1 + subject2 + subject3 + subject4) / 4.0;
    }
}

public class Q3 {
    public static void main(String[] args) {
        A studentA = new A(50, 85, 90);
        B studentB = new B(75, 80, 65, 90);

        System.out.println("Percentage of marks for Student A: " + studentA.getPercentage() + "%");
        System.out.println("Percentage of marks for Student B: " + studentB.getPercentage() + "%");
    }
}
