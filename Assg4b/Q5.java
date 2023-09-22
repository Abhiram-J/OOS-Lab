import java.util.Scanner;

class Account {
    protected String account_holder_name;
    protected Double balance;

    public Account(String account_holder_name, Double initial_balance) {
        this.account_holder_name = account_holder_name;
        this.balance = initial_balance;
    }

    public void credit(Double amount) {
        balance += amount;
    }

    public void debit(Double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance!");
        }
    }
}

class SBI extends Account {
    public SBI(String account_holder_name, Double initial_balance) {
        super(account_holder_name, initial_balance);
    }

    public Double calculate_interest() {
        return balance * 0.08; 
    }
}

class HDFC extends Account {
    public HDFC(String account_holder_name, Double initial_balance) {
        super(account_holder_name, initial_balance);
    }

    public Double calculate_interest() {
        return balance * 0.07; 
    }
}

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter SBI customer details");
        String sbiName = sc.next();
        Double sbiInitialBalance = sc.nextDouble();
        Double sbiCreditAmount = sc.nextDouble();
        Double sbiDebitAmount = sc.nextDouble();

        SBI sbiCustomer = new SBI(sbiName, sbiInitialBalance);
        sbiCustomer.credit(sbiCreditAmount);
        sbiCustomer.debit(sbiDebitAmount);

        System.out.println("Enter HDFC customer details");
        String hdfcName = sc.next();
        Double hdfcInitialBalance = sc.nextDouble();
        Double hdfcCreditAmount = sc.nextDouble();
        Double hdfcDebitAmount = sc.nextDouble();

        HDFC hdfcCustomer = new HDFC(hdfcName, hdfcInitialBalance);
        hdfcCustomer.credit(hdfcCreditAmount);
        hdfcCustomer.debit(hdfcDebitAmount);

        System.out.println(sbiCustomer.account_holder_name + " " + sbiCustomer.balance + " " +  String.format("%.2f",sbiCustomer.calculate_interest() ));
        System.out.println(hdfcCustomer.account_holder_name + " " + hdfcCustomer.balance + " " + String.format("%.2f",hdfcCustomer.calculate_interest() ) );

        sc.close();
    }
}
