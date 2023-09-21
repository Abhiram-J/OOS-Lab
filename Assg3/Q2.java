import java.util.*;

 class InventoryItem {
    Integer id;
    String name;
    Integer unitPrice;

    InventoryItem(){}

    InventoryItem(Integer id, String name, Integer unitPrice) {
        this.id = id;
        this.name = name;
        this.unitPrice = unitPrice;
    }
}

class InvoiceItem extends InventoryItem{
    Integer quantity;

    InvoiceItem(InventoryItem inventoryItem, Integer quantity) {
        this.id = inventoryItem.id;
        this.name = inventoryItem.name;
        this.unitPrice = inventoryItem.unitPrice;
        this.quantity = quantity;
    }

    Integer calculateTotal() {
        return this.unitPrice * quantity;
    }
}

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<InventoryItem> inventoryItems = new ArrayList<>();
        List<InvoiceItem> invoiceItems = new ArrayList<>();

        System.out.println("Enter the available inventory items line by line, type OKAY at the end of the list:");
        while (true) {
            String input = sc.next();
            if (input.equals("OKAY")) {
                break;
            }
            Integer id = Integer.parseInt(input);
            String name = sc.next();
            Integer unitPrice = sc.nextInt();

            inventoryItems.add(new InventoryItem(id, name, unitPrice));
        }

        while (true) {
            System.out.println("1. Add Invoice");
            System.out.println("2. Exit");
            System.out.print("Choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println(
                            "Enter the available inventory items line by line, type OKAY at the end of the list:");
                    while (true) {
                        String input = sc.next();
                        if (input.equals("OKAY")) {
                            break;
                        }
                        Integer id = Integer.parseInt(input);
                        Integer quantity = sc.nextInt();
                        boolean found =false;
                        for (InventoryItem item : inventoryItems) {
                            if (item.id == id) {
                            invoiceItems.add(new InvoiceItem(item, quantity));
                            found = true;
                                break;
                            }
                        }

                        if (!found) {
                            System.out.println("Invalid inventory ID.");
                        }
                    }
                    System.out.println("****INVOICE****");
                    Integer total = 0;
                    for ( InvoiceItem item : invoiceItems){
                        total += item.unitPrice * item.quantity;
                        System.out.println(item.id+ "," + item.name + "," + item.unitPrice + "," + item.quantity);
                    }
                    System.out.println("Total: " + total);
                    System.out.println("********");

                    break;
                case 2:
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        }

    }
}
