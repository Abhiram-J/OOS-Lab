import java.util.Scanner;

class Customer {
    protected String customerName;
    protected String accountNo;
    protected double currentBalance;

    public Customer(String customerName, String accountNo, double currentBalance) {
        this.customerName = customerName;
        this.accountNo = accountNo;
        this.currentBalance = currentBalance;
    }

    public void availableBalance() {
        System.out.println(customerName + ":" + currentBalance);
    }
}

class SilverMembership extends Customer {
    public SilverMembership(String customerName, String accountNo, double currentBalance) {
        super(customerName, accountNo, currentBalance);
    }

    public void availableBalance() {
        double predictedBalance = currentBalance * 1.05;
        System.out.println(customerName + ":" + currentBalance + ":Silver:" + String.format("%.2f", predictedBalance));
    }
}

class GoldMembership extends Customer {
    public GoldMembership(String customerName, String accountNo, double currentBalance) {
        super(customerName, accountNo, currentBalance);
    }

    public void availableBalance() {
        double predictedBalance = currentBalance * 1.10;
        System.out.println(customerName + ":" + currentBalance + ":Gold:" + String.format("%.2f", predictedBalance));
    }
}

class PlatinumMembership extends Customer {
    public PlatinumMembership(String customerName, String accountNo, double currentBalance) {
        super(customerName, accountNo, currentBalance);
    }

    public void availableBalance() {
        double predictedBalance = currentBalance * 1.15;
        System.out
                .println(customerName + ":" + currentBalance + ":Platinum:" + String.format("%.2f", predictedBalance));
    }
}

public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Customer customer;
        Customer[] listOfCustomers = new Customer[n];
        for (int i = 0; i < n; i++) {
            String[] input = scanner.next().split(":");
            String customerName = input[0];
            String accountNo = input[1];
            double currentBalance = Integer.parseInt(input[2]);
            if (currentBalance < 100000) {
                customer = new SilverMembership(customerName, accountNo, currentBalance);
            } else if (currentBalance >= 100000 && currentBalance < 1000000) {
                customer = new GoldMembership(customerName, accountNo, currentBalance);
            } else {
                customer = new PlatinumMembership(customerName, accountNo, currentBalance);
            }
            listOfCustomers[i] = customer;

        }

        for (Customer c : listOfCustomers) {
            c.availableBalance();
        }
        scanner.close();
    }
}
