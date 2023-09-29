import java.util.Scanner;

class Employee {
    protected int employeeId;
    protected String employeeName;
    protected double salary;

    public Employee(int employeeId, String employeeName) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = 0;
    }

    public void calculateSalary() {
    }

    public double getSalary() {
        return salary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }
}

class PermanentEmployee extends Employee {
    private double basicPay;
    private double PFAmount;

    public PermanentEmployee(int employeeId, String employeeName, double basicPay) {
        super(employeeId, employeeName);
        this.basicPay = basicPay;
        this.PFAmount = 0.12 * basicPay;
    }

    public void calculateSalary() {
        salary = basicPay - PFAmount;
    }
}

class TemporaryEmployee extends Employee {
    private double hoursWorked;
    private double hourlyWages;

    public TemporaryEmployee(int employeeId, String employeeName, double hoursWorked, double hourlyWages) {
        super(employeeId, employeeName);
        this.hoursWorked = hoursWorked;
        this.hourlyWages = hourlyWages;
    }

    public void calculateSalary() {
        salary = hourlyWages * hoursWorked;
    }
}

public class Q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        Employee[] employees = new Employee[n];

        for (int i = 0; i < n; i++) {
            int employeeType = scanner.nextInt();
            int employeeId = scanner.nextInt();
            String employeeName = scanner.next();

            if (employeeType == 1) {
                double basicPay = scanner.nextDouble();
                employees[i] = new PermanentEmployee(employeeId, employeeName, basicPay);
            } else if (employeeType == 2) {
                double hoursWorked = scanner.nextDouble();
                double hourlyWages = scanner.nextDouble();
                employees[i] = new TemporaryEmployee(employeeId, employeeName, hoursWorked, hourlyWages);
            }
        }

        int queryEmployeeId = scanner.nextInt();

        boolean found = false;

        for (Employee employee : employees) {
            if (employee.getEmployeeId() == queryEmployeeId) {
                employee.calculateSalary();
                System.out.println(employee.getEmployeeId() + " " + employee.getEmployeeName() + " " +
                        String.format("%.2f", employee.getSalary()));
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("-1");
        }

        scanner.close();
    }
}
