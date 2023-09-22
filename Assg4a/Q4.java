import java.util.Scanner;

class TellphoneCall {
    private String phNo;
    private String custName;
    private Integer callSlots;
    private Integer totalBill;

    public void readCustomer() {
        Scanner sc = new Scanner(System.in);
        custName = sc.nextLine();
        phNo = sc.nextLine();
        callSlots = sc.nextInt();
        sc.close();
    }

    public void computeBill() {
        int rentalCharges = 300;

        if (callSlots <= 100) {
            totalBill = rentalCharges + 500;
        } else if (callSlots <= 200) {
            totalBill = rentalCharges + (callSlots * 8);
        } else if (callSlots <= 300) {
            totalBill = rentalCharges + (callSlots * 10);
        } else {
            totalBill = rentalCharges + (callSlots * 15);
        }

        System.out.println(totalBill);
    }
}

public class Q4 {
    public static void main(String[] args) {
        TellphoneCall customer = new TellphoneCall();
        customer.readCustomer();
        customer.computeBill();
    }
}
