import java.util.ArrayList;
import java.util.Scanner;

class Employee {
    public Integer id;
    public String name;
    public String department;
    public Integer salary;

    public Employee(Integer id, String name, String department, Integer salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public Integer getSalary() {
        return salary;
    }

}

class Manager extends Employee {
    public Integer bonus;

    public Manager(Integer id, String name, String department, Integer salary, Integer bonus) {
        super(id, name, department, salary);
        this.bonus = bonus;
    }

    @Override
    public Integer getSalary() {
        return super.getSalary() + bonus;
    }

    
}

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Integer n = sc.nextInt();
        sc.nextLine();

        ArrayList<Manager> managers = new ArrayList<>(); 
        Integer maxSalary = 0;

        for (int i = 0; i < n; i++) {
            Integer id = sc.nextInt();
            String name = sc.next();
            String department = sc.next();
            Integer salary = sc.nextInt();
            Integer bonus = sc.nextInt();

            Manager manager = new Manager(id, name, department, salary, bonus);
            managers.add(manager);
            if (manager.getSalary() > maxSalary) {
                maxSalary = manager.getSalary();
            }
        }

        for (Manager manager : managers) {
            if (maxSalary.equals(manager.getSalary())) {
                System.out.println(manager.id + " " + manager.name + " " + manager.department + " " + manager.salary + " " + manager.bonus);
            }
        }

        sc.close();
    }
}
