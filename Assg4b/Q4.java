import java.util.Scanner;

class Employee {
    protected String name;
    protected String emp_id;

    public Employee(String name, String emp_id) {
        this.name = name;
        this.emp_id = emp_id;
    }

    public String getName() {
        return name;
    }

    public String getEmpId() {
        return emp_id;
    }
}

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int numEmployees = sc.nextInt();

        Employee[] employees = new Employee[numEmployees];

        System.out.println("Enter details :");
        for (int i = 0; i < numEmployees; i++) {
            String name = sc.next();
            String emp_id = sc.next();
            employees[i] = new Employee(name, emp_id);
        }

        for (Employee employee : employees) {
            System.out.println(employee.getName() + " " + employee.getEmpId());
        }
        sc.close();
    }
}
