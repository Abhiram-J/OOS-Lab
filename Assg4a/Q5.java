import java.util.Scanner;

class Person {
    private String name;
    private Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public int calculatePension() {
        int pensionAmount = 0;

        if (age > 65) {
            pensionAmount = 500;

            if (age > 70) {
                pensionAmount += 100;
            }
        }

        return pensionAmount;
    }
}

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        Integer age = sc.nextInt();
        sc.close();

        Person person = new Person(name, age);
        Integer pensionAmount = person.calculatePension();
        System.out.println(pensionAmount);
    }
}
