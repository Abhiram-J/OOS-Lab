interface User {
    String getUsername();

    String getEmail();

    void displayProfile();
}

interface Purchasable {
    String getName();

    double getPrice();

    void displayProductInfo();
}

class CustomerImpl implements User, Purchasable {
    private String username;
    private String email;
    private String name;
    private double price;

    public CustomerImpl(String username, String email, String name, double price) {
        this.username = username;
        this.email = email;
        this.name = name;
        this.price = price;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public void displayProfile() {
        System.out.println("User Profile:");
        System.out.println("Username: " + getUsername());
        System.out.println("Email: " + getEmail());
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void displayProductInfo() {
        System.out.println("Product Information:");
        System.out.println("Product Name: " + getName());
        System.out.println("Price: $" + getPrice());
    }
}

public class Q10 {
    public static void main(String[] args) {
        CustomerImpl customer = new CustomerImpl("john_doe", "john@example.com", "Laptop", 1000);
        customer.displayProfile();
        customer.displayProductInfo();
    }
}
