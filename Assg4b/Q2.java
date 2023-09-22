import java.util.Scanner;

class Person {
    String name;
    Integer age;
    Person() {}

    Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}

class Emp extends Person {
    String emp_id;
    Integer salary;

    Emp(String name, Integer age, String emp_id, Integer salary) {
        this.name = name;
        this.age = age;
        this.emp_id = emp_id;
        this.salary = salary;
    }
}

class Manager extends Emp {
    String managing_dep;
    Integer no_of_employees_working_under;

    Manager(String name, Integer age, String emp_id, Integer salary, String managing_dep, Integer no_of_employees_working_under) {
        super(name, age, emp_id, salary);
        this.managing_dep = managing_dep;
        this.no_of_employees_working_under = no_of_employees_working_under;
    }

    public String toString() {
        return name + " " + age + " " + emp_id + " " + salary + " " + managing_dep + " " + no_of_employees_working_under;
    }

}

public class Q2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of Managers: ");
        Integer numManagers = sc.nextInt();

        Manager[] managers = new Manager[numManagers];

        System.out.println("Enter details:");
        for (int i = 0; i < numManagers; i++) {
            String name = sc.next(); 
            Integer age = sc.nextInt(); 
            String emp_id = sc.next(); 
            Integer salary = sc.nextInt(); 
            String managing_dep = sc.next(); 
            Integer no_of_employees_working_under = sc.nextInt(); 

            managers[i] = new Manager(name, age, emp_id, salary, managing_dep, no_of_employees_working_under);
        }

        System.out.println("Output:");
        for (Manager manager : managers) {
            System.out.println(manager);
        }

        sc.close();
    }
}
